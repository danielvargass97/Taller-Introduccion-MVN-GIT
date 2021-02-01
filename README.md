# TALLER INTRODUCCION A MAVEN Y GIT
## DANIEL VARGAS ORDOÑEZ - 2140905
## AREP 2021-1
### Profesor: Daniel Benavides.

### Media estadistica y desviación estandar.

El objetivo de este proyecto es realizar el calculo de la media estadistica y la desviación estandar de un grupo de datos. Los datos que se entregaran para calcular la media estadistica y la desviación estandar deberan ser almacenados en una lista enlazada implementada por el estudiante, implementando iterator

### Arquitectura de la lista enlazada que implemeto el estudiante:

La base de esta lista enlazada son los nodos, los cuales se utilizan para almacenar un valor y tener referencia a los nodos siguiente y anterior. En caso de que el nodo sea el primer o ultimo valor de la lista tendra en su respectiva referencia un Null lo que indicara el fin de los datos almacenados en la lista. Este proyecto se construyo en el lenguaje de programación JAVA, editor Eclipse y MAVEN para su fespectiva ejecucion. Ademas se realizo control de versiones utilizando GIT y fueron almacenadas en GITHUB.

### LICENCIA

Para información de la licencia (GNU General Public License v3.0) siga este [enlace][1]

[1]: https://github.com/danielvargass97/Taller-Introduccion-MVN-GIT/blob/main/LICENSE.txt

### DISEÑO

![Design](https://user-images.githubusercontent.com/50029247/106500599-0365bf00-6490-11eb-8097-826eb898c035.png)

### Explicación del diseño

El diseño cuenta con 4 clases principales divididas en 2 paquetes. En el paquete LinkedList (lista enlazada) en el cual estan las clases Node (nodo) que esta encargada de la creación de nodos y sus enlaces para la lista enlazada; la clase LinkedList(lista enlazada) la cual crea nuestra lista, implementa los metodos de las listas en JAVA ademas de los metodos de extración de datos, almacenamiento y eliminacipon utilizados para los calculos respectivos. En el paquete Calculator (calculadora) en el cual estan las clases Mean (media) y StandardDeviation (desviación estandar). Las cuales estan encargadas de hacer su respectivo calculo usando la lista enlazada diseñada por el estudiante.

