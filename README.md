# Java Advanced

[![Build Status](https://img.shields.io/travis/danielsunzhongyuan/java_advanced.svg)](https://travis-ci.org/danielsunzhongyuan/java_advanced)
[![Codecov](https://codecov.io/gh/danielsunzhongyuan/java_advanced/branch/master/graph/badge.svg)](https://codecov.io/gh/danielsunzhongyuan/java_advanced)
![License](https://img.shields.io/github/license/danielsunzhongyuan/java_advanced.svg)

Java sample codes with all technical skills that I can use.


## 注意
1. 每增加一个module，需要手动
    * 在pom的properties里新加：<advanced.main.basedir>${project.parent.basedir}</advanced.main.basedir>
2. 新增加一个module的命令是：

>mvn archetype:generate -DgroupId=com.zsun.java.utils -DartifactId=utils -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false 

修改groupId和artifactId