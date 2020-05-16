## YuScript   
A script engine for iyu v3.   
一个针对iyu v3（裕语言v3）的脚本运行器。
Only core code supported by this project (Actually only grammar). There is some sample methods used to test.      
本项目只包含其核心功能，即语法支持。其中只有一些样例方法。   
If you want to have more methods, do it by yourself.   
如果需要更多功能请自行添加。   
## 与官方语言的不同   
* 代码书写自由,不需要把一个语句写在同一行  
* 允许在传递函数参数时使用一个表达式而不是单个变量或常量   
* 舍弃了ss()函数,直接书写加法表达式来完成字符串拼接(但是你仍然可以使用它来把特定的变量转换为字符串)  
* 在任意代码块中自定义函数并且使用    
* 在f()和w()中的语句必须是条件表达式而不是一个变量或用条件连接符连接的变量(**将在未来版本中改进**)   
## 自定义函数   
默认只添加`YuMethod`下的方法，为了使功能更加丰富，我们允许你自定义方法。   
### 使用自动化的JavaFunction   
你可以通过把你的方法用`ScriptMethod`注解来表示它是一个脚本方法。  
用`ScriptMethod`标记的方法，如果有返回值，则会自动设置返回值，不需要手动设置。    
用`ScriptMethod`标注的方法可以在参数声明（并且仅能声明）：   
* `Object` 指示传入下一个参数的实际值
* `YuExpression` 指示传入下一个参数的原始表达式
* `YuContext` 指示传入当前运行环境的上下文
* `Object[]` 指示传入函数所有参数的值
* `YuExpression[]` 指示传入函数所有参数的原始表达式
`ScriptMethod`的可选参数：
* `rtValueAtBegin` 指示函数的返回值应该在首个位置而不是最后一个位置
* 现在已支持直接在注解中重定义方法名称,为`scriptEnvName`.默认为`"@DEFAULT"`表示使用原有名称   
然后通过`FunctionManager`的`addFunctionFromClass`或者`addFunctionFromMethod`来注册整个类以`ScriptMethod`标注的方法或者指定的方法到函数查找路径   
提示：使用构造器`JavaFunction(Method,String)`可以自定义方法名      
### 使用扩展性强的Function   
你可以通过手动实现`Function`这一接口来实现函数。    
实现时必须特别注意：函数的返回值也是一个参数，在函数定义中占位，计入参数个数。      
由自定义Function实现的函数必须手动处理返回值的设定（使用`YuContext`）。   
功能具体可以参考`JavaFunction`的实现。   
## 特别声明
本项目只为交流学习使用。   
如果本项目涉嫌侵权，请第一时间发送邮件到我的邮箱(roses2020@qq.com 或 2073412493@qq.com)来通知我删除项目。