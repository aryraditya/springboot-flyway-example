CREATE TABLE "users" (
    id uuid PRIMARY KEY,
    username varchar(50) UNIQUE NOT NULL,
    email varchar(150) UNIQUE NOT NULL,
    phone varchar(20),
    name varchar(150) NOT NULL ,
    created_at TIMESTAMP WITH TIME ZONE,
    updated_at TIMESTAMP WITH TIME ZONE,
    deleted_at TIMESTAMP WITH TIME ZONE
)
