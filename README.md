# basic-hibernate-setup
a basic hibernate setup to be used for simple projects

## build and run

$ mvn clean install
$ java -jar target/hibernate-1.0-SNAPSHOT-jar-with-dependencies.jar

## see stuff in the db

$ java -cp ~/.m2/repository/com/h2database/h2/1.3.176/h2-1.3.176.jar org.h2.tools.Shell -url jdbc:h2:~/hibernate

sql> select * from t_person;