require 'rubygems'
require 'nokogiri'
require 'mysql2'
require 'open-uri'
require 'active_support/core_ext/object'

url_main="http://www.simplyrecipes.com/subject-index.php"

#opening the url for html parsing

@doc= Nokogiri::HTML(open(url_main))
#creating object of connection with the database 
@client = Mysql2::Client.new :host => "localhost", :username => "root", :password=>"root", :database => "scrapping"

#extracting the links of recipe categories

@recipe_category=@doc.css('.center-module a').map{|href| href['href']}

#creating mysql tables
@client.query("create table if not exists category_lists(id int Primary Key auto_increment, link varchar(30));")

@client.query("create table if not exists recipies(link_2 varchar(30), id int UNSIGNED);")

@client.query("create table if not exists recipe_details(id int UNSIGNED, link varchar(30), name varchar(20), img_link varchar(30), description varchar(200), method varchar(500));")

#to accept escape characters

#inserting the links in the table category_lists
	@recipe_category.each do |index|
		 if index.present?

#to accept data with escape characters
		 category_link_escaped = @client.escape(index)
			 #puts index

 			 @client.query("INSERT INTO category_lists (link) VALUES('#{category_link_escaped}');" )
		 end
	end

#opening each link to get sub-links and storing those in the table recipies
	  
	  @recipe_category.each do |k|
		  if k.present?
			 for j in 0..20
			  @doc_2=Nokogiri::HTML(open(k))

#to accept data with escape characters
			  recipe_link_escaped = @client.escape(k)

			@client.query("INSERT INTO recipies (link_2) VALUES('#{recipe_link_escaped}');" )
			end #end of for
		end #end of if
	end #end of each

#opening each recipe link and scraping the recipe page content
        @doc_2.each do |i|
	  if i.present?
	        @doc_3=Nokogiri::HTML(open(i))
		recipe_name=@doc_3.css(".center h1").text
		recipe_img=doc.css(".entry img").map{|src| src['src']}
		recipe_description= @doc_3.css("#recipe-intro").text
		recipe_method=@doc_3.css("#recipe-callout").text

#to accept data with escape characters            
                recipe_name_escaped = @client.escape(recipe_name)
                recipe_name_escaped = @client.escape(recipe_img)
                recipe_name_escaped = @client.escape(recipe_description)
                recipe_name_escaped = @client.escape(recipe_method)

		@client.query("INSERT INTO recipe_details (name, img_link, description, method) VALUES('+#{recipe_name}, +#{recipe_img},+#{recipe_description}, +#{recipe_method}');")
	   end #end of if
  end # end of each
