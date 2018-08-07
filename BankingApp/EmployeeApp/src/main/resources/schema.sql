

CREATE TABLE IF not exist public.employee_details (
    employee_Id character varying(255) COLLATE pg_catalog."default" unique NOT NULL,
    first_name character varying(255) COLLATE pg_catalog."default" unique NOT NULL,
    last_name character varying(255) COLLATE pg_catalog."default" unique NOT NULL,
    ssn bigint COLLATE pg_catalog."default" unique NOT NULL
    mobilr_num bigint COLLATE pg_catalog."default" unique NOT NULL
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
); 