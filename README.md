Java Parse Iso8601 Date Demo
=====================

看了一圈，还是SimpleDateFormat最简单。

`LocalDate`看着有点晕

How to run:

1. Run `Hello.java` in your IDE.
2. Use maven plugin `exec-maven-plugin`:
   ```
   mvn clean compile exec:java
   ```
3. Use maven plugin `maven-dependency-plugin` and `maven-jar-plugin`
   ```
   mvn clean package; java -jar target/demo.jar
   ```