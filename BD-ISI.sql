PGDMP     5                    u            PM-ISI    9.6.2    9.6.2     n           0    0    ENCODING    ENCODING     #   SET client_encoding = 'SQL_ASCII';
                       false            o           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            p           1262    16671    PM-ISI    DATABASE     �   CREATE DATABASE "PM-ISI" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE "PM-ISI";
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            q           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12387    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            r           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    16735    animal    TABLE     �   CREATE TABLE animal (
    acod character(5) NOT NULL,
    raza character varying(20) NOT NULL,
    fechanac date NOT NULL,
    peso real NOT NULL,
    ecod character(5) NOT NULL
);
    DROP TABLE public.animal;
       public         postgres    false    3            �            1259    16706    empleado    TABLE     �   CREATE TABLE empleado (
    legajo character(5) NOT NULL,
    dni character varying(8) NOT NULL,
    nombre character varying(50) NOT NULL,
    telefono character varying(12) NOT NULL,
    domicilio character varying(60)
);
    DROP TABLE public.empleado;
       public         postgres    false    3            �            1259    16720    establecimiento    TABLE     �   CREATE TABLE establecimiento (
    ecod character(5) NOT NULL,
    nombre character varying(50) NOT NULL,
    ubicacion character varying(60) NOT NULL,
    pcod character(5) NOT NULL,
    legajo character(5)
);
 #   DROP TABLE public.establecimiento;
       public         postgres    false    3            �            1259    16745 
   produccion    TABLE     �   CREATE TABLE produccion (
    nroreg character(5) NOT NULL,
    fecha date NOT NULL,
    cantlts real NOT NULL,
    sng real NOT NULL,
    densidad real NOT NULL,
    acod character(5) NOT NULL,
    legajo character(5)
);
    DROP TABLE public.produccion;
       public         postgres    false    3            �            1259    16713 	   productor    TABLE     �   CREATE TABLE productor (
    pcod character(5) NOT NULL,
    dni character varying(8) NOT NULL,
    nombre character varying(50) NOT NULL,
    telefono character varying(12) NOT NULL,
    domicilio character varying(60)
);
    DROP TABLE public.productor;
       public         postgres    false    3            j          0    16735    animal 
   TABLE DATA               ;   COPY animal (acod, raza, fechanac, peso, ecod) FROM stdin;
    public       postgres    false    188   �        g          0    16706    empleado 
   TABLE DATA               E   COPY empleado (legajo, dni, nombre, telefono, domicilio) FROM stdin;
    public       postgres    false    185   �        i          0    16720    establecimiento 
   TABLE DATA               I   COPY establecimiento (ecod, nombre, ubicacion, pcod, legajo) FROM stdin;
    public       postgres    false    187    !       k          0    16745 
   produccion 
   TABLE DATA               R   COPY produccion (nroreg, fecha, cantlts, sng, densidad, acod, legajo) FROM stdin;
    public       postgres    false    189   =!       h          0    16713 	   productor 
   TABLE DATA               D   COPY productor (pcod, dni, nombre, telefono, domicilio) FROM stdin;
    public       postgres    false    186   Z!       �           2606    16739    animal animal_pkey 
   CONSTRAINT     K   ALTER TABLE ONLY animal
    ADD CONSTRAINT animal_pkey PRIMARY KEY (acod);
 <   ALTER TABLE ONLY public.animal DROP CONSTRAINT animal_pkey;
       public         postgres    false    188    188            �           2606    16712    empleado empleado_dni_key 
   CONSTRAINT     L   ALTER TABLE ONLY empleado
    ADD CONSTRAINT empleado_dni_key UNIQUE (dni);
 C   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_dni_key;
       public         postgres    false    185    185            �           2606    16710    empleado empleado_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY empleado
    ADD CONSTRAINT empleado_pkey PRIMARY KEY (legajo);
 @   ALTER TABLE ONLY public.empleado DROP CONSTRAINT empleado_pkey;
       public         postgres    false    185    185            �           2606    16724 $   establecimiento establecimiento_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY establecimiento
    ADD CONSTRAINT establecimiento_pkey PRIMARY KEY (ecod);
 N   ALTER TABLE ONLY public.establecimiento DROP CONSTRAINT establecimiento_pkey;
       public         postgres    false    187    187            �           2606    16749    produccion produccion_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY produccion
    ADD CONSTRAINT produccion_pkey PRIMARY KEY (nroreg);
 D   ALTER TABLE ONLY public.produccion DROP CONSTRAINT produccion_pkey;
       public         postgres    false    189    189            �           2606    16719    productor productor_dni_key 
   CONSTRAINT     N   ALTER TABLE ONLY productor
    ADD CONSTRAINT productor_dni_key UNIQUE (dni);
 E   ALTER TABLE ONLY public.productor DROP CONSTRAINT productor_dni_key;
       public         postgres    false    186    186            �           2606    16717    productor productor_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY productor
    ADD CONSTRAINT productor_pkey PRIMARY KEY (pcod);
 B   ALTER TABLE ONLY public.productor DROP CONSTRAINT productor_pkey;
       public         postgres    false    186    186            �           2606    16740    animal animal_ecod_fkey    FK CONSTRAINT     q   ALTER TABLE ONLY animal
    ADD CONSTRAINT animal_ecod_fkey FOREIGN KEY (ecod) REFERENCES establecimiento(ecod);
 A   ALTER TABLE ONLY public.animal DROP CONSTRAINT animal_ecod_fkey;
       public       postgres    false    187    2024    188            �           2606    16725 +   establecimiento establecimiento_legajo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY establecimiento
    ADD CONSTRAINT establecimiento_legajo_fkey FOREIGN KEY (legajo) REFERENCES empleado(legajo);
 U   ALTER TABLE ONLY public.establecimiento DROP CONSTRAINT establecimiento_legajo_fkey;
       public       postgres    false    187    2018    185            �           2606    16730 )   establecimiento establecimiento_pcod_fkey    FK CONSTRAINT     }   ALTER TABLE ONLY establecimiento
    ADD CONSTRAINT establecimiento_pcod_fkey FOREIGN KEY (pcod) REFERENCES productor(pcod);
 S   ALTER TABLE ONLY public.establecimiento DROP CONSTRAINT establecimiento_pcod_fkey;
       public       postgres    false    186    187    2022            �           2606    16755    produccion produccion_acod_fkey    FK CONSTRAINT     p   ALTER TABLE ONLY produccion
    ADD CONSTRAINT produccion_acod_fkey FOREIGN KEY (acod) REFERENCES animal(acod);
 I   ALTER TABLE ONLY public.produccion DROP CONSTRAINT produccion_acod_fkey;
       public       postgres    false    2026    188    189            �           2606    16750 !   produccion produccion_legajo_fkey    FK CONSTRAINT     x   ALTER TABLE ONLY produccion
    ADD CONSTRAINT produccion_legajo_fkey FOREIGN KEY (legajo) REFERENCES empleado(legajo);
 K   ALTER TABLE ONLY public.produccion DROP CONSTRAINT produccion_legajo_fkey;
       public       postgres    false    189    185    2018            j      x������ � �      g   :   x�K�500�445351����*M�S(H-J��463521��I,K��IU044����� O�      i      x������ � �      k      x������ � �      h      x������ � �     