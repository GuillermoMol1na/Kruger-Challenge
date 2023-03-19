# Kruger-Challenge

La base de datos tiene como nombre "challenge" y tiene 4 tablas:

 ---------Empleado-----------
 ![image](https://user-images.githubusercontent.com/112204038/226150373-25ebc4a5-8349-4207-8449-084c60d6c540.png)

 ---------Vacuna-----------
 ![image](https://user-images.githubusercontent.com/112204038/226150385-e6ba67e0-c4ed-40a4-abbc-86694dd3272b.png)


 ---------Id_tipo_Vacuna-----------
 
 ![image](https://user-images.githubusercontent.com/112204038/226150423-2c433b28-6a7f-4078-9618-d341aeb70d87.png)
 
 ---------Administrador-----------
 ![image](https://user-images.githubusercontent.com/112204038/226150447-d43030af-f8ee-48ff-b900-516b0d589e4b.png)

El puerto empleado es PostgreSQL es el 5434, usualmente es el 5432 por lo que es pertinente mencionarlo.

Los controllers de Adminisrador emplean los services del mismo para cumplir con las funciones de listado (con filtro de vacunas incluido) de los Empleados,
registro de Empleados, edición de Empleados preexistentes y la eliminación de los mismos (En caso de que el empleado se haya vacunado, también se eliminan sus 
registros correspondientes en la tabla de Vacuna).

Los controlers también mantienen el número adecuado de caracteres numéricos en la cédula de identidad de los empleados, así como las restricciones de caracteres
especiales y números en sus nombres y apellidos.

El controller de Empleado se encarga de llenar los campos faltantes de la entidad Empleado, como ser su Fecha de Nacimiento, dirección, teléfono y si se encuentra vacunado,
en el mismo proceso también se emplean los services de Vacuna e Id_tipo_vacuna para que los campos relacionados con la entidad Vacuna (Fecha de Vac, Dosis, tipo de Vac) 
sean llenados junto con la id_cedula que servirá como llave relacional entre empleado y vacuna.

Los procesos de los services emplean los DTOs y Value Objects de las Entidades previamente definidas.

A continuación mostraré algunas pruebas elaboradas en Postman:

--------REGISTRAR EMPLEADO---------
![image](https://user-images.githubusercontent.com/112204038/226150700-7499a200-ad97-4f5f-9254-3c8b780d47e5.png)

--------LLENADO DE DATOS DEL EMPLEADO---------
![image](https://user-images.githubusercontent.com/112204038/226150759-ce77389b-d537-47e4-ac29-0ec85b12de13.png)

--------LISTADO DE TODOS LOS NO VACUNADOS---------
![image](https://user-images.githubusercontent.com/112204038/226150881-3952f4e9-7e8a-4a55-843e-bda0fa21d304.png)

--------LISTADO DE TODOS LOS VACUNADOS CON SPUTNIK---------
![image](https://user-images.githubusercontent.com/112204038/226151087-e1623afb-a949-4567-904f-fee586abe80a.png)

Gracias por la oportunidad de participación. 
