# Apache-Log4j
Apache Log4j 远程代码执行

> 攻击者可直接构造恶意请求，触发远程代码执行漏洞。漏洞利用无需特殊配置，经阿里云安全团队验证，Apache Struts2、Apache Solr、Apache Druid、Apache Flink等均受影响



尝试复现，目录结构：

- log4j 本地日志
- RMIServer 远程服务端

- Log4jRCE 远程注入脚本



执行流程：

1 启动RMIServer

2 执行log4j main 方法



执行结果：

![](https://yloopdaed-public.oss-cn-shanghai.aliyuncs.com/log4j.png)
