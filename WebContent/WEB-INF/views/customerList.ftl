<html>
   <head>
      <title>Customers</title>
   </head>  
   <body>
      <div>        
         <table>
           <#list customers as customer>
           <tr>
           <td>${customer.name!}</td>
           <td>${customer.email!}</td>
           <td>${customer.address!}</td>
           </tr>
         </#list>
         </table>
      </div>
   </body>
</html>