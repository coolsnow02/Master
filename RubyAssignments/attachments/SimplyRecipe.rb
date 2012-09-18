require 'rubygems'
require 'nokogiri'
require 'mysql'

url='http://www.simplyrecipes.com/subject-index.php'
url-open=nokogiri::HTML(open(url))

