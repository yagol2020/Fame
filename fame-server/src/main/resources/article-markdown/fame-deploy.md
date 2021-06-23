[Fame](https://github.com/zzzzbw/Fame) 是基于SpringBoot、Mysql、MyBatis、Nuxt和Vue-Cli的博客项目。
Fame项目的部署配置和部署文档在[这里](https://zzzzbw.github.io/Fame/#/)

## Fame部署
Fame项目最简单的部署方式是基于Docker-compose部署。基础的运行环境仅需要
* git
* docker-compose
首先拉取项目代码，然后使用docker-compose构建项目，命令如下：
  
```shell
git clone https://github.com/zzzzbw/Fame.git
cd Fame
sudo docker-compose up -d
```

构建过程中的日志，或者运行日志可以通过如下命令获得：
```shell
cd Fame
sudo docker-compose logs -f
```
其中，`-f`指令表示不断读取/刷新日志

## Fame修改后重部署
如果你根据需求修改了Fame项目的代码，可以使用git进行重部署，命令如下：
```shell
git fetch "your git url"
git merge
sudo docker-compose up -d
```
有时，前端项目无法重部署，可以先清空docker再部署，如下：
```shell
sudo docker-compose down
sudo docker-compose up -d
```
或者
```shell
sudo docker-compose down
sudo docker-compose build
sudo docker-compose up -d
```

## 注意事项
不用担心重部署后Mysql数据会消失，Mysql的数据存储在容器之外