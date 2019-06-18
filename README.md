# Java Advanced

[![Build Status](https://img.shields.io/travis/xcatliu/pagic.svg)](https://travis-ci.org/danielsunzhongyuan/java_advanced)


Java sample codes with all technical skills that I can use.


## 注意
1. 每增加一个module，需要手动
    * 在pom的properties里新加：<advanced.main.basedir>${project.parent.basedir}</advanced.main.basedir>
2. 新增加一个module的命令是：

>mvn archetype:generate -DgroupId=com.zsun.java.utils -DartifactId=utils -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false 

修改groupId和artifactId