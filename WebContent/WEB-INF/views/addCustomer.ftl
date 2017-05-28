<#import "/spring.ftl" as spring/>
<html>
   <head>
      <title>Customers</title>
   </head>  
   <body>
      <div>          
        	<form method="post" id="customerForm" name="customerForm"  action="./">
        	   Name:
        <@spring.bind "customerForm.name"/>
        <input type="text" name="${spring.status.expression}" />
        
        <@spring.bind "customerForm.email"/>
        <input type="text" name="${spring.status.expression}" />
        
        <@spring.bind "customerForm.address"/>
        <input type="text" name="${spring.status.expression}" />
        <input type="submit" value="submit"/>
        </form>
        
      </div>
   </body>
</html>