#### 拉取项目

```shell 
$ git clone -b team4 https://github.com/bitworld2099/HangHaiOneHomeWork.git
```

#### 

![1577543110481](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1577543110481.png)



### 导入项目到idea



#### 新建自己的项目
(1)选择项目`vue-springboot`>>右键>>New >> Module
![](https://api.onedrive.com/v1.0/shares/s!AnfzhZ6EzsFXgSp7tzb6rkWXiXCV/root/content)
(2)选择Spring Initializer>>Next
![](https://api.onedrive.com/v1.0/shares/s!AnfzhZ6EzsFXgStJCBQwp2njldbD/root/content)

(3)填写项目信息

![](https://api.onedrive.com/v1.0/shares/s!AnfzhZ6EzsFXgSxYDEQej71inXQt/root/content)

![1577543233044](C:\Users\Administrator\Desktop\1577543233044.png)

(4)一直Next直到Finish



(5)修改POM文件

![](https://api.onedrive.com/v1.0/shares/s!AnfzhZ6EzsFXgS34jFXtK65Ci6N3/root/content)

* 修改自己项目根目录下`pom.xml`文件的`parent`元素，改为`vue-springboot`父项目

  ```xml
  <parent>
      <groupId>com.gzmtu.team4</groupId>
      <artifactId>vue-springboot</artifactId>
      <version>0.0.1-SNAPSHOT</version>
  </parent>
  ```

  

* 修改`vue-springboot`项目下的`pom.xml`，再`modules`添加自己的模块

  ```xml
  <modules>
          <module>vuespringboot-team4-wujiyu</module>
      	<module>添加你自己新建的module</module>
  </modules>
  ```

  

