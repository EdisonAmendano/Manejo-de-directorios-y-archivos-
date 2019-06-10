# Manejo de directorios y archivos

En el Manejo de directorios y archivos vamos a ver como podemos manipular los diferentes archivos de la computador con métodos que nos proporciona java en donde vamos a poder listar, obtener datos, crear, renombrar, eliminar esos archivos.
![0](https://user-images.githubusercontent.com/49033575/59178034-73893980-8b23-11e9-93c3-c84b0d1bd705.png)

Para la realización de Manejo de directorios y archivos primero listamos los archivos de un directorio en las jList y para esto guardamos la lista de un directorio dentro de un vector y lo recorremos para ir importando en la JList a la vez que vamos preguntando de que tipo de archivo se trata
 ![1](https://user-images.githubusercontent.com/49033575/59177503-f7dabd00-8b21-11e9-9ea6-36af99f17304.png)
 
Al momento de seleccionar un archivo se muestra su ruta, ultima modificación y su tamaño para esto creamos un nuevo fichero donde le pasamos la ruta del archivo seleccionado, y con el método lastModified(); obtenemos la ultima modificación,  getAbsolutePath() obtenemos la ruta y  con fichero.length() el tamaño.
 ![2](https://user-images.githubusercontent.com/49033575/59177511-fdd09e00-8b21-11e9-8567-ba1b35d76e3e.png)
 
Para crear un archivo se utilizo un JOption para obtener el nombre del archivo, donde teníamos que controlar si estaba seleccionado un directorio crearlo dentro de este. Se tenia que controlar si existía un archivo con ese nombre y para esto usamos el método exists() y para crear el archivo el método createNewFile();
 ![3](https://user-images.githubusercontent.com/49033575/59177533-0923c980-8b22-11e9-849b-b50bd3fa1148.png)
 
Para renombrar un archivo se tuvo que controlar si estaba seleccionado un archivo y que tipo de pues crear un File con la ruta del archivo seleccionado , luego, obtener por un jOption el nuevo nombre donde se comprobaba si existía un archivo con ese nombre y para renombrar se usó el método  renameTo(archivoNuevo); donde le pasa un File con el nuevo nombre.
 ![4](https://user-images.githubusercontent.com/49033575/59177534-09bc6000-8b22-11e9-8d47-8c1b11da32e7.png)
 
Para eliminar un archivo se usa la misma lógica que se atiza para renombrar en donde el método eliminar es delete();, pero al momento de tratar de eliminar un directorio que contenga archivos dentro no nos va a dejar y para solucionar eso se uso un método recursivo donde se le  pasa la ruta del directorio para crear un File con este después se crea un vector con la lista de archivos dentro del directorio  y al recorrer la lista se pregunta si es un directorio y en caso que no fuese se elimina el archivo y al caso contrario se le vuelve a enviar el mismo método pero con la nueva ruta del directorio y al terminar el recorrido de la lista se elimina el directorio.

![5](https://user-images.githubusercontent.com/49033575/59177535-09bc6000-8b22-11e9-877a-a8431c394be3.png)

Para crear un nuevo directorio se usa la misma lógica para crear un archivo con el método mkdir();
 ![6](https://user-images.githubusercontent.com/49033575/59177536-09bc6000-8b22-11e9-88e1-2ec4b584ae0d.png)
 
Para ingresar a un directorio dándole doble click se usa el evento MouseClicked donde con el método getClickCount()==2 comprobamos si se dio doble click. Para ingresar al directorio se crea una nueva ruta con el nombre del directorio seleccionado se le setea la ruta y cargamos el método que es el mismo que se usa para buscar.
 ![7](https://user-images.githubusercontent.com/49033575/59177537-09bc6000-8b22-11e9-9e7e-e711b754e83b.png)
 
Para regresar a la ruta anterior se obtiene la ruta de la caja de texto y con un for retrocedemos hasta encontrar un ( \ ) don guardamos la nueva ruta y mandamos al método buscar con la nueva ruta.
 ![8](https://user-images.githubusercontent.com/49033575/59177538-0a54f680-8b22-11e9-84e7-ad6cdb02623a.png)

Se pudo observar que el manejo de archivos es muy importante ya que esto nos ayuda a poder manejar los archivos de la computadora libremente.

Cuenta gitGub

Usuario: EdisonAmendano

URl: https://github.com/EdisonAmendano/Manejo-de-directorios-y-archivos-.git


Nombre: Edison Amendaño

Firma: 

![Firma1](https://user-images.githubusercontent.com/49033575/59178036-73893980-8b23-11e9-9b55-1fb073092d1b.jpg)
 
