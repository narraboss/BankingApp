

CREATE TABLE IF not exist public.customer_details (
    customer_id character varying(255) COLLATE pg_catalog."default" unique NOT NULL,
    first_name character varying(255) COLLATE pg_catalog."default" unique NOT NULL,
    last_name character varying(255) COLLATE pg_catalog."default" unique NOT NULL,
    ssn bigint COLLATE pg_catalog."default" unique NOT NULL
    mobilr_num bigint COLLATE pg_catalog."default" unique NOT NULL
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
); 


-- Table: public.user_details

-- DROP TABLE public.user_details;

CREATE TABLE public.user_details
(
    user_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
    password character varying(255) COLLATE pg_catalog."default" NOT NULL,
    role character varying(255) COLLATE pg_catalog."default" NOT NULL,
    first_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    email_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    mobile_num character varying(255) COLLATE pg_catalog."default" NOT NULL,
    user_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT user_details_pkey PRIMARY KEY (user_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.user_details
    OWNER to postgres;
	
	-- Table: public.account_details

-- DROP TABLE public.account_details;

CREATE TABLE public.account_details
(
    account_number character varying(255) COLLATE pg_catalog."default" NOT NULL,
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
    account_balance character varying(255) COLLATE pg_catalog."default" NOT NULL,
    user_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT account_details_pkey PRIMARY KEY (account_number),
    CONSTRAINT account_details_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES public.user_details (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.account_details
    OWNER to postgres;
	
	-- Table: public.address

-- DROP TABLE public.address;

CREATE TABLE public.address
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    country character varying(255) COLLATE pg_catalog."default" NOT NULL,
    address_type character varying(255) COLLATE pg_catalog."default" NOT NULL,
    building_num character varying(255) COLLATE pg_catalog."default" NOT NULL,
    city character varying(255) COLLATE pg_catalog."default" NOT NULL,
    state character varying(255) COLLATE pg_catalog."default" NOT NULL,
    street character varying(255) COLLATE pg_catalog."default" NOT NULL,
    zipcode character varying(5) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT address_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.address
    OWNER to postgres;
	
	-- Table: public.beneficiary

-- DROP TABLE public.beneficiary;

CREATE TABLE public.beneficiary
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
    acc_hldr_mail character varying(255) COLLATE pg_catalog."default" NOT NULL,
    acc_hldr_mob_number character varying(255) COLLATE pg_catalog."default" NOT NULL,
    acc_hldr_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    user_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT beneficiary_pkey PRIMARY KEY (id),
    CONSTRAINT beneficiary_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES public.user_details (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.beneficiary
    OWNER to postgres;
	
-- Table: public.customer_details

-- DROP TABLE public.customer_details;

CREATE TABLE public.customer_details
(
    customer_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
    first_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    mobilr_num bigint NOT NULL,
    ssn bigint NOT NULL,
    user_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT customer_details_pkey PRIMARY KEY (customer_id),
    CONSTRAINT customer_details_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES public.user_details (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.customer_details
    OWNER to postgres;
	
-- Table: public.employee_details

-- DROP TABLE public.employee_details;

CREATE TABLE public.employee_details
(
    employee_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
    first_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    mobilr_num bigint NOT NULL,
    ssn bigint NOT NULL,
    user_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT employee_details_pkey PRIMARY KEY (employee_id),
    CONSTRAINT employee_details_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES public.user_details (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.employee_details
    OWNER to postgres;
	
	-- Table: public.customer_details

-- DROP TABLE public.customer_details;

CREATE TABLE public.customer_details
(
    customer_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
    first_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    mobilr_num bigint NOT NULL,
    ssn bigint NOT NULL,
    user_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT customer_details_pkey PRIMARY KEY (customer_id),
    CONSTRAINT customer_details_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES public.user_details (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.customer_details
    OWNER to postgres;
	
	
	-- Table: public.beneficiary

-- DROP TABLE public.beneficiary;

CREATE TABLE public.beneficiary
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    created_by character varying(255) COLLATE pg_catalog."default",
    created_date timestamp without time zone,
    modified_by character varying(255) COLLATE pg_catalog."default",
    modified_date timestamp without time zone,
    acc_hldr_mail character varying(255) COLLATE pg_catalog."default" NOT NULL,
    acc_hldr_mob_number character varying(255) COLLATE pg_catalog."default" NOT NULL,
    acc_hldr_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    user_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT beneficiary_pkey PRIMARY KEY (id),
    CONSTRAINT beneficiary_user_id_fkey FOREIGN KEY (user_id)
        REFERENCES public.user_details (user_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.beneficiary
    OWNER to postgres;
	
	
	-- Table: public.address

-- DROP TABLE public.address;

CREATE TABLE public.address
(
    id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    country character varying(255) COLLATE pg_catalog."default" NOT NULL,
    address_type character varying(255) COLLATE pg_catalog."default" NOT NULL,
    building_num character varying(255) COLLATE pg_catalog."default" NOT NULL,
    city character varying(255) COLLATE pg_catalog."default" NOT NULL,
    state character varying(255) COLLATE pg_catalog."default" NOT NULL,
    street character varying(255) COLLATE pg_catalog."default" NOT NULL,
    zipcode character varying(5) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT address_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.address
    OWNER to postgres;
