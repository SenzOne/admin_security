# Описание проекта

Мой проект - это веб-приложение, разработанное на основе Spring Boot. Оно предоставляет функционал для управления пользователями и их ролями.
Состоит из фронтенд и беканд частей, которые работают по Rest API, обновление контента происходит без перезагрузки страницы.

база данных поднимается в docker-контейнере. И заполняется данными с помощью Liquibase.

## Функционал

* Управление пользователями: добавление, удаление, редактирование пользователей
* Управление ролями: добавление, удаление, редактирование ролей
* Авторизация и аутентификация пользователей

## Технологии

* Spring Boot
* Spring Security
* Java
* Liquibase
* JavaScript


## Запуск:
docker-compose up -d

## Доступ:
### admin:
* **login:** admin@ya.ru
* **password:** admin

### user:
* **login:** user1@ya.ru
* **password:** user

