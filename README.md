```
create table sql_detail(
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    client_sql varchar(1000),
    host varchar(250),
    username varchar(50),
    password varchar(50),
    param varchar(200),
    client_ip varchar(25),
    add_time timestamp NOT NULL default CURRENT_TIMESTAMP,
    update_time timestamp NOT NULL default CURRENT_TIMESTAMP
)

create table history(
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    sql_id int,
    run_sql varchar(1000),
    param varchar(200),
    run_time bigint,
    client_ip varchar(25),
    client_type varchar(10),
    start_time timestamp NOT NULL default CURRENT_TIMESTAMP,
    end_time timestamp NOT NULL default CURRENT_TIMESTAMP
)

```