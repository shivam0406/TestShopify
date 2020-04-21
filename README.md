# TestShopify

Script execution:-
mvn clean test -DsuiteXmlFile=${xmlFileName}

for chrome : chrometestng.xml
for FF : FFtestng.xml


sample report is under the target dir. 

File Name : extent.html

Note:- We tried to achieve the parallel execution but are test are not getting executed on both the browser i.e. FF,Chrome. 
Though, browser pop is happening. 

for parallel execution you can try to execute below command. 

mvn clean test -DsuiteXmlFile=parallel.xml