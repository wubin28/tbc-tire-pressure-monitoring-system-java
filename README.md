tbc-tire-pressure-monitoring-system-java
========================================

Tire Pressure Monitoring System in Java is the 1st of the 4 TDD with Mock Objects (see Luca Minudel's repo https://github.com/lucaminudel/TDDwithMockObjectsAndDesignPrinciples) katas in my book Taming the Bad Code with Katas.

本repo是我正在撰写的《操练驯服烂代码》一书中的用TDD驯服烂代码的4个mock操练例子中的第1个。这个例子的源代码来自ThoughtWorks Studio的培训师和教练Luca Minudel在两年前设计的编程操练系列题目TDD with Mock Objects。这个题目是轮胎气压监测系统。有两个类Alarm和Sensor，其中Sensor类负责获取轮胎气压值，而Alarm类则检查Sensor传来的气压值，若在正常范围之外则报警。本操练要求为Alarm类编写单元测试，最后在测试的保护下实现一个新功能：每次检查胎压前，都需要将状态重置到非报警状态。