
超链接
[https://blog.csdn.net/qq_29496057/article/details/53333419](https://blog.csdn.net/qq_29496057/article/details/53333419)

下载超链接
[https://pan.baidu.com/s/1sl3v6Xn](https://pan.baidu.com/s/1sl3v6Xn)


下面开始做exe程序：

1.首先解压压缩包得到如图文件（如遇无法下载，联系Q1937962235）



2.创建一个文件夹（名字随意）

然后将将刚刚生成的jar包和jre(jre是你安装JDK环境时候安装的，如果你是默认安装的话，jre的路径应该是C:\Program Files (x86)\Java\jre1.8.0_111)这两个文件复制到新建的文件夹中（如果你的项目使用了其他资源的话，都一同复制到文件夹中）
3 我们将javalauncher文件夹中的launch.exe、launcher.cfg这两个文件，复制到新建的文件夹里。launcher.cfg是一个仅三行内容的文本文件，要修改时用记事本方式打开

4.修改launcher.cfg

第一行设置指向JAR包myswt.jar的目录，由于launch.exe和myswt.jar同在一个目录，所以用“.”即当前目录。
        第二行设置指向jre\bin\javaw.exe的路径。(在第2步中已将jre目录复制到了新建文件夹下)




  5.    配置好launcher.cfg后，双击launch.exe即可运行java应用程序。

如果你想换图标的话，请进行如下操作

用Resource Hacker工具来替换launch.exe的图标的步骤如下：
  解压附件中的rh_chinese_gb.zip，
  1 运行ResHacker.exe，进入主界面


  2 单击主菜单“文件→打开”，将launch.exe载入到程序中


  3 载入Lanunch.exe之后的界面，选择左边的“图标→1→1030”，然后右键单击“1030”项，选择“替换资源…”。在弹出窗口中单击“打开新图标文件”，选择一个满意的图标，然后单击“替换”按钮。


    附注：图标文件可以是exe、dll、res、ico，该软件可以从exe、dll、res抽取出图标


  4 选择“文件→另存为”，存到新建文件夹下的目录里，取名my(任意).exe。




  5 可见my.exe（也就是launch.exe改了个名称）的图标换成了新图标。双击my.exe即可运行Java应用程序。

这样你的代码在别人的电脑上也可以完美运行了。
---------------------
作者：OnePointC
来源：CSDN
原文：https://blog.csdn.net/qq_29496057/article/details/53333419
版权声明：本文为博主原创文章，转载请附上博文链接！