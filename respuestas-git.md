¿Qué diferencia existe entre git add y git commit?
git add sirge para preparar los cambios que vas a guardar, mientras que git commit sirve para guardar esos cambios en el historial del repositorio

¿Qué hace git push? ¿Por qué puede ser rechazado?
git push sirve para subir los commits al repositorio. Puede ser rechazado si hay cambios en el repositorio que no tienes en local

¿En qué se diferencian git fetch y git pull?
git fetch descarga los cambios, pero no los aplica, mientras que git pull descarga los cambios y los aplica

¿Qué significa origin/main?
origin/main es la rama principal del repositorio

¿Qué muestra git status antes y después de git add?
Antes de git add, git status muestra los archivos modificados que aún no están preparados. Después de git add, muestra los cambios preparados para hacer un git commit.

¿Qué información muestra git diff --cached?
git diff --cached muestra los cambios que has preparado con git add y que se guardarán en el próximo git commit.

¿Para qué sirve git log --oneline HEAD..origin/main?
Sirve para mostrar los commits que están en origin/main, pero que todavía no están en la rama local.

¿Por qué conviene usar commits pequeños y descriptivos?
Porque facilitan entender los cambios, encontrar errores y deshacer cambios concretos si es necesario.

¿Cómo has resuelto el push rechazado?
Primero hice git pull --no-rebase para fusionarlos y luego volví a hacer git push

¿En qué carpeta y ventana de IntelliJ estabas cuando ocurrió el rechazo?
En la carpeta de unidad-02 y en la terminal integrada de IntelliJ