# Auto24Tests
Auto24Tests

#1 
go to http://www.auto24.ee
change language to EN
select Make BMW
select Model 530
select Make Audi
Check the value in Make input is rest to 'all'

#2
go to http://www.auto24.ee
change language to EN
select Make BMW
enter price range 5000-7000
sort by price
search
check the price for the first result listed is no less than 5000
check the price for the last result listed is no greater than 7000

#3
go to http://www.auto24.ee
change language to EN
select Make Audi
enter price range 5000-7000
slect fuel diesel
search
enter search name 'affordable Audi'
save search
check there's only one saved search
