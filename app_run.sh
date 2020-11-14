javac -sourcepath ./src -d bin src/old/tablepowertwo/CopyOfTablePowerTwo.java
java -classpath ./bin old.tablepowertwo.CopyOfTablePowerTwo
javac -sourcepath ./src -d bin src/old/tablepowertwo/TablePowerTwo.java
java -classpath ./bin old.tablepowertwo.TablePowerTwo

javac -sourcepath ./src -d bin src/old/tablepowertwo2/TablePowerTwo.java
java -classpath ./bin old.tablepowertwo2.TablePowerTwo
javac -sourcepath ./src -d bin src/old/tablepowertwoSeek/TablePowerTwo.java
java -classpath ./bin old.tablepowertwoSeek.TablePowerTwo

javac -sourcepath ./src -d bin src/release/tablepowertwo/CopyOfTablePowerTwo.java
java -classpath ./bin release.tablepowertwo.CopyOfTablePowerTwo
javac -sourcepath ./src -d bin src/release/tablepowertwo/Release.java
java -classpath ./bin release.tablepowertwo.Release
javac -sourcepath ./src -d bin src/release/tablepowertwo/TablePowerTwo.java
java -classpath ./bin release.tablepowertwo.TablePowerTwo

javac -sourcepath ./src -d bin src/release2/tablepowertwo/Release.java
java -classpath ./bin release2.tablepowertwo.Release

javac -sourcepath ./src -d bin src/test_arr_list/Test.java
java -classpath ./bin test_arr_list.Test