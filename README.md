# Project 22/2/2023

### Phần 1: Spring Boot Tests

#### 1)Thực hiện viết code cho từng layer, Entity tùy chọn

##### Xây dựng Entity
* **Xây dựng Entity Tutorial:**
![2A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.1.1.png)

##### Xây dựng tầng Repository
* **Xây dựng tầng Repository:**
![3A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.1.2.png)

##### Xây dựng tầng Service
* **Xây dựng tầng Service:**
![4A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.1.3.png)
![4B](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.1.4.png)

##### Xây dựng tầng Controller
* **Xây dựng tầng Controller:**
![5A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.1.5.png)
![5B](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.1.6.png)
![5C](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.1.7.png)

#### 2)Thực hiện viết test case cho từng layer 

##### Test trên tầng Repository
* **Xây dựng test trên tầng Repository:**
![7A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.2.1.png)
* **Kết quả:**
![7B](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.2.2.png)

##### Test trên tầng Service
* **Xây dựng test trên tầng Service:**
![8A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.2.3.png)
![8B](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.2.4.png)
![8C](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.2.5.png)
* **Kết quả:**
![8D](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/I.2.6.png)

##### Test trên tầng Controller
* **Xây dựng test trên tầng Controller:**
![9A](https://github.com/Bachos0605/ProjectTutorials/blob/main/Updated_Project_Tutorials/src/main/resources/Static/U2.png)
![9B](https://github.com/Bachos0605/ProjectTutorials/blob/main/Updated_Project_Tutorials/src/main/resources/Static/U3.png)
![9C](https://github.com/Bachos0605/ProjectTutorials/blob/main/Updated_Project_Tutorials/src/main/resources/Static/U4.png)
* **Kết quả:**
![9D](https://github.com/Bachos0605/ProjectTutorials/blob/main/Updated_Project_Tutorials/src/main/resources/Static/U1.png)

### Phần 2: Actuator, Devtools

#### 1)Sử dụng Actuator

##### Cài đặt port quản lý giám sát, enable và truy vấn tất cả các endpoints
* **Cài đặt port quản lý giám sát là 8090, enable cho tất cả các endpoints:**
![11A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/II.1.1.png)
* **Thực hiện truy vấn vào nơi xem các endpoints của ứng dụng:**
![11B](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/II.1.2.png)

##### Truy vấn thông tin sức khỏe ứng dụng
* **Truy vấn thông tin sức khỏe ứng dụng bằng endpoints actuator/health:**
![12A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/II.1.3.png)

##### Thực hiện shutdown ứng dụng
* **Thực hiện shutdown ứng dụng bằng cách sử dụng phương thức POST với endpoints actuator/shutdown:**
![13A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/II.1.4.png)
* **Kết quả:**
![13A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/II.1.5.png)

#### 2)Sử dụng Devtools

##### Thực hiện đổi port quản lý giám sát
* **Đổi port quản lý giám sát thành 8091 trên file application.properties:**
![15A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/II.2.1.png)

##### Thực hiện truy vấn tất cả các endpoints
* **Thực hiện truy vấn vào nơi xem các endpoints của ứng dụng bằng port mới đổi:**
![16A](https://github.com/Bachos0605/Project22_2/blob/main/Project_Tutorials/src/main/resources/Static/II.2.2.png)


