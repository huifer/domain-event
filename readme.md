# Domain event manager 
- 领域事件管理项目
## feature


## 设计
### 词汇表
Event Handling Application: With the ability of "handling event"
Event scheduling center: Forwarding events to different event handling applications
Event Registry Center: collecting and storing event information together 
Event Registry: Registering event and sending it into Event Registry Center
Event Handling Ability Registry: Registering event handling classes of Event Handling Application
Event Handler: Handling service of corresponding event
Event Table: 
Event Actuator: The actuator of event






```sequence
Title: Event handler registration process
Event_Handler_app -> Event_Registry: call event register
Event_Registry -> Event_Table: save 
```







```sequence
title: Event scheduling
app-> Event_Executor: execute
Event_Executor ->app: return
Event_Executor --> Event_Registry: search event handler detail
Event_Registry --> Event_Executor: event detail
Event_Executor --> Event_Handler_center: execute
Event_Handler_center --> Event_Handler_app: work

```





