[![imagen-2023-03-28-161316861.png](https://i.postimg.cc/rFCpWZMG/imagen-2023-03-28-161316861.png)](https://postimg.cc/nCrZfksM)  

# YourAccount  

Descripción:  

Your Account nace de la necesidad de querer almacenar y recordar cuentas de usuarios, cubriendo necesidades personales, tanto para el público gaming    
y pequeñas microempresas que se dedican a la venta de cuentas de Streaming.  

Su función: es registrar usuarios y una vez estos estén registrados, puedan crear distintos tipos de cuentas, las cuales se guardarán en una tabla llamada   accounts_user relacionada al id del usuario que esta logueado en ese momento. De esta manera el usuario podrá almacenar las cuentas que desee  
dentro de su perfil, y además las podrá ir editando o eliminando a medida que haga cambios reales en alguna de ellas.  
Con esto, todos aquellos que tengan más de algún correo o cuentas dentro de un mismo juego con distintas finalidades, podran recordar cada una de ellas sin olvidar sus    datos.

El proyecto en si, es una aplicación web deseñada en Java bajo el patrón de diseño MVC.  
Para su desarrollo se trabajó con Spring Framework, conexión a base de datos "your account" mediante JPA y Hibernate.
  
En cuanto a seguridad se implementó Spring Security con el fin de que solo aquellos usuarios logueados puedan acceder mediante un rol especifico a las  interfaces de   registros de cuentas de la aplicación.  
Además se construyó un servicio Rest Api para manipular la entidad de Users, la cual almacenara todos los usuarios registrados en nuestra aplicación web,  de esta   forma se nos permitirá usar todos los métodos de un CRUD a través de la herramienta de Postman, con el fin de crear, listar, editar y eliminar algún usuario    
deseado junto a todas sus listas de cuentas registradas.

A continuación algunas imagenes del front end de nuestra aplicación:  

Menú creación de usuarios:  

[![registro-usuario.jpg](https://i.postimg.cc/Hkb5K9wB/registro-usuario.jpg)](https://postimg.cc/v4Hcx9SV)  

Login:  

[![login.jpg](https://i.postimg.cc/1z9gdh53/login.jpg)](https://postimg.cc/4YSNK09D)  

Menú listado de Cuentas:  

[![listado-de-cuentas.jpg](https://i.postimg.cc/667hcRm1/listado-de-cuentas.jpg)](https://postimg.cc/MXSRKcxy)  

Menú creación de cuentas:  

[![creacion-de-cuentas.jpg](https://i.postimg.cc/d0xyZNwQ/creacion-de-cuentas.jpg)](https://postimg.cc/DW1ZtgSR)  

