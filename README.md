# Педиатрия
## Описание
Приложение представляет собой социальную сеть для врачей(педиатров). Основные элементы приложения:
1. Элементы управления:
  - Боковая выезжающая панель
  - Нижнее навигационное меню
2. Фрагменты:
  - Новости
  - Трансляции
  - Сообщения
  - Друзья
  - Вебинары
  - Конференции
  - Тестирование
  - Разборы
  - Поддержка
3. Активити:
  - Вход/регистрация
  - Активити восстановления пароля?
  - Главное активити с фрагментами
  - Профиль
  - Новость
  - Тестирование
  - Трансляция
  - Разбор теста
  - Конференция
  - Чат(2 человека/ групповой)
---
### Активити "Вход"
Активити содержит:
  1. Страницу загрузки
  2. Страницу ввода данных для входа/ регистрации
---
### Главное активити
Это основное активити. Здесь отображаются все фрагменты.
Основные элементы активити:
#### Боковая выезжающая панель
Панель содержит:
1. Изображение пользователя
2. Имя пользователя 
3. Специальность пользователя
4. Список с наименованиями фрагментов, при нажатии на которые происходит переход в соответствующий фрагмент.
#### Нижнее навигационное меню
Меню содержит три кнопки:
  1. Новости
  2. Трансляции
  3. Сообщения
При нажатии на кнопку происходит переход в соответствующий раздел.
#### Фрагмент "Новости"
Данный фрагмент представляет список карточек с новостями. При нажатии на карточку выполняется переход в активити "Новость".
Вверху списка должны быть расположены текущие и прошедшие трансляции (см. пример Instagram) 
Каждая карточка с новостью содержит:
  1. Изображение
  2. Название
  3. Краткое описание
  4. Дату публикации
  5. Кнопку с количеством лайков(при нажатии поставить/ убать лайк)
  6. Кнопку с количеством комментариев(При нажатии происходит переход в активити "Новость" и скроллинг к раздеру "комментарии")
 
 ![Пример карточки](https://github.com/HungryGrizzzly/pediatry-kotlin/raw/master/design/news_card.png)
 
#### Фрагмент "Трансляции"
Данный фрагмент представляет список карточек с прошедшими и текущими трансляциями.
Каждая карточка содержит:
  1. Изображение
  2. индикатор трансляции(прошедшая или текущая
  3. Если трансляция прошедшая, то должны быть указаны дата и время трансляции
  3. Название
При нажатии на карточку происходит переход в активити "Трансляция".

 ![Пример карточки](https://github.com/HungryGrizzzly/pediatry-kotlin/raw/master/design/translation_card.png)

#### Фрагмент "Сообщения"

![Пример карточки](https://github.com/HungryGrizzzly/pediatry-kotlin/raw/master/design/messages_card.png)
