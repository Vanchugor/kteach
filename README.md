### Как настроить бэкенд
- Во-первых, стоит посмотреть [видео](https://www.youtube.com/watch?v=oVrmcEy3UMM) про настройку БД локально.
- Установить Docker и сделать как в видео. Для этого имеются даже .cmd-файлы в директории [back](https://github.com/Vanchugor/kteach/tree/dev/back) с уже прописанными командами: `create_db_container.cmd` и `start_db_container.cmd`.
- Не забываем выполнить `mvn package` в директории back.
- Затем запускаем приложение. Phpmyadmin будет по адресу `http://localhost:7098/`. Вводим логин `root` и пароль `rootroot`.
