<html>
   <head>
      <title>Customers</title>
   </head>  
   <body>
      <div>        
        <ul>
        <#list customers as customer>
           <li>${customer.name}</li>
         </#list>
         </ul>
      </div>
   </body>
</html>