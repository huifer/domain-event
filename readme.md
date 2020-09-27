# Domain event manager 
- 领域事件管理项目

## 设计
### 词汇表
- 事件处理应用: 具有 **事件处理** 能力的应用
- 事件调度中心: 将事件转发给不同的事件处理应用
- 事件注册中心: 集中收集事件, 中央存储事件信息
- 事件注册器: 将事件注册到事件中心 
- 事件处理能力注册: 将事件处理应用中的事件处理类注册
- 事件处理器: 处理对应事件的service
- 事件表: 事件对应事件处理器
- 事件执行器: 事件的执行工具







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





