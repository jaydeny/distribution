create table client(
  client_id nvarchar(10) primary key ,
  client_name nvarchar(10) ,
  client_sex int ,
  role_id nvarchar(10) ,
  client_pwd nvarchar(10) ,
  client_tel nvarchar(20) ,
  client_bir datetime ,
  client_addr nvarchar(50) ,
  client_com nvarchar(100)
);

create table orders (
  order_id nvarchar(10) primary key ,
  order_type int,
  delivery_id nvarchar(10),
  goods_name nvarchar(20),
  goods_weight int,
  post_name nvarchar(20),
  post_addr nvarchar(50),
  post_tel nvarchar(20),
  get_name nvarchar(20),
  get_tel nvarchar(20),
  get_addr nvarchar(50),
  order_status int,
  start_city nvarchar(10),
  mid_city nvarchar(10),
  end_city nvarchar(10),
  transt_price decimal(18,0),
  distribut_price decimal(18,0),
  total_price nvarchar(20),
  car_id nvarchar(10),
  order_com nvarchar(50)
);

create table car(
  car_id nvarchar(10) primary key ,
  car_type nvarchar(10),
  car_dimension nvarchar(20),
  route_id nvarchar(10),
  car_bir datetime,
  buy_date datetime,
  car_com nvarchar(50)
);

create table city(
  city_id nvarchar(10) primary key ,
  city_name nvarchar(10),
  province_id nvarchar(10)
);

create table cityArea(
  area_id nvarchar(10) primary key ,
  area_name nvarchar(50),
  city_id nvarchar(10)
);

create table admin(
  admin_id nvarchar(10) primary key ,
  admin_name nvarchar(10),
  admin_sex int,
  admin_status int,
  admin_city nvarchar(10),
  admin_addr nvarchar(50),
  admin_pwd nvarchar(10),
  admin_tel nvarchar(20),
  admin_com nvarchar(50),
  role_id nvarchar(10)
);

create table delivery(
  delivery_id nvarchar(10) primary key ,
  start_city nvarchar(10),
  end_city nvarchar(10),
  mid_city nvarchar(10),
  status int,
  make_date datetime,
  deliver_com nvarchar(50)
);

create table route(
  route_id nvarchar(10) primary key ,
  route_name nvarchar(10),
  start_pro_id nvarchar(10),
  start_city_id nvarchar(10),
  mid_pro_id nvarchar(10),
  mid_city_id nvarchar(10),
  end_pro_id nvarchar(10),
  end_city_id nvarchar(10),
  transt_price decimal(18,0),
  route_com nvarchar(50)
);

create table Distribution (
  distribut_id int primary key ,
  distribut_name nvarchar(10),
  pro_id nvarchar(10),
  city_id nvarchar(10),
  admin_id nvarchar(10),
  distribut_tel nvarchar(20),
  distribut_addr nvarchar(50),
  distribut_com nvarchar(50)
);

create table distributionArea(
  dis_area_id int primary key ,
  dis_area_name nvarchar(10),
  dis_price decimal(18,0),
  city_id nvarchar(10),
  dis_com nvarchar(50)
);

create table province(
  pro_id nvarchar(10) primary key ,
  pro_name nvarchar(10)
);

create table role(
  role_id nvarchar(10) primary key ,
  role_name nvarchar(10) not null ,
  role_com nvarchar(50)
);




