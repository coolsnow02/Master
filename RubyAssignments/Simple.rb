require 'rubygems'
require 'nokogiri'
require 'mysql2'
require 'open-uri'
require 'active_support/core_ext/object'


url_main="http://www.simplyrecipes.com/recipes/classic_baked_acorn_squash/"
doc= Nokogiri::HTML(open(url_main))

recipe_category=doc.css('.center a').map{|href| href ['href']}

recipe_category.each do |index|
 if index.present?
 puts index
 @client.query ("INSERT INTO category_list(link) VALUES ('"+#{index}"')" )
 end
end

   recipe_category.each do |index|
  if index.present?
 puts index
  doc_2=Nokogiri::HTML(open(#{index}))


        doc_2.each do |i|
  if i.present?
    @client.query ("INSERT INTO recipies(link_2) VALUES ('"+#{i}"')" )
        doc_3=Nokogiri::HTML(open(i))
recipe_name=doc_3.css(".center h1").text
recipe_img= doc_3.css(".entry img").map{|href| href ['href']}
recipe_description= doc_3.css("#recipe-intro").text
recipe_method=doc_3.css("#recipe-callout")

  @client.query ("INSERT INTO recipe_details(name, img_link, description, method) VALUES ('"+#{recipe_name}", "+#{recipe_img}","+#{recipe_description}", "+#{recipe_method}" ')" )
   end
  end
 end
end







