# androidPatchUpgrade
android增量更新，ndk实现
第一步，在android studio上编译出old.apk和new.apk两个文件（修改一下版本号做标识）。使用bsdiff指令，生成patch文件。

bsdiff old.apk new.apk update.patch

第二步，android项目集成bspatch功能（ndk实现）。

第三步，测试阶段，将patch文件放到sd卡中，启动apk时，检测patch文件。若符合升级策略就生成apk文件，完成安装。

完整android代码：https://github.com/androiddeveloper007/androidPatchUpgrade

bsdiff相关文件，百度云链接：https://pan.baidu.com/s/1T_Dya209IqMFEZYMPOcteA 
提取码：e0k6 
（bspatch程序可以通过old.apk和patch文件生成目标apk。可用作测试）