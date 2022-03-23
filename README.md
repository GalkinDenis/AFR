Прикрепил АПК файл.

- MVVM;  
- Retrofit 2;  
- Room;  
- Flow;
- Coroutines;  
- Picasso;  
- Single Activity;  
- Navigation architecture;  
- Dagger 2.  

Приложение состоит из трех экранов:
- Экран со списком пользователей
- Экран “О программе”
- Экран карточки пользователя

Переход между первыми двумя экранами осуществляется при помощи нижнего навигационного меню (реализовать подход Single Activity App).

Экран со списком пользователей:
-       На этом экране, должна происходить загрузка списка пользователей.  
 Должен присутствовать индикатор загрузки. После загрузки должен отображаться список пользователей,  
 каждый элемент списка должен состоять из Имени и Фамилии пользователя. В случае, если загрузка по каким-то причинам не удалась, требуется оповестить об этом пользователя.
-       По клику на элемент списка должен открываться экран карточки пользователя.  
 В карточке пользователя должен отображаться аватар пользователя, его фамилия и имя, а так же email
Экран “О программе” содержит текст “Тестовое задание для Rentateam”
 

https://reqres.in/api/users - get метод, возвращающий список пользователей

