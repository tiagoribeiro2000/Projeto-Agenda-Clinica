PGDMP     (                    y            projetoclinica    13.0    13.1 %    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394    projetoclinica    DATABASE     n   CREATE DATABASE projetoclinica WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE projetoclinica;
                postgres    false            �            1259    57364    bairro    TABLE     b   CREATE TABLE public.bairro (
    baicodigo integer NOT NULL,
    bainome character varying(30)
);
    DROP TABLE public.bairro;
       public         heap    postgres    false            �            1259    57362    bairro_baicodigo_seq    SEQUENCE     �   CREATE SEQUENCE public.bairro_baicodigo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.bairro_baicodigo_seq;
       public          postgres    false    205            �           0    0    bairro_baicodigo_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.bairro_baicodigo_seq OWNED BY public.bairro.baicodigo;
          public          postgres    false    204            �            1259    16397    medicos    TABLE     �   CREATE TABLE public.medicos (
    cod_medico integer NOT NULL,
    nome_medico character varying(50) NOT NULL,
    especializacao_medico character varying(50) NOT NULL,
    crm_medico integer NOT NULL
);
    DROP TABLE public.medicos;
       public         heap    postgres    false            �            1259    16395    medicos_cod_medico_seq    SEQUENCE     �   CREATE SEQUENCE public.medicos_cod_medico_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.medicos_cod_medico_seq;
       public          postgres    false    201            �           0    0    medicos_cod_medico_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.medicos_cod_medico_seq OWNED BY public.medicos.cod_medico;
          public          postgres    false    200            �            1259    57381 	   pacientes    TABLE     b  CREATE TABLE public.pacientes (
    paci_codigo integer NOT NULL,
    paci_nome character varying(50),
    paci_nasci date,
    paci_rg character varying(15),
    paci_telefone character varying(15),
    paci_rua character varying(45),
    paci_cep character varying(8),
    paci_complemento character varying(35),
    paci_baicodigo integer NOT NULL
);
    DROP TABLE public.pacientes;
       public         heap    postgres    false            �            1259    57387    pacientes_paci_baicodigo_seq    SEQUENCE     �   CREATE SEQUENCE public.pacientes_paci_baicodigo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.pacientes_paci_baicodigo_seq;
       public          postgres    false    207            �           0    0    pacientes_paci_baicodigo_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.pacientes_paci_baicodigo_seq OWNED BY public.pacientes.paci_baicodigo;
          public          postgres    false    208            �            1259    57379    pacientes_paci_codigo_seq    SEQUENCE     �   CREATE SEQUENCE public.pacientes_paci_codigo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.pacientes_paci_codigo_seq;
       public          postgres    false    207            �           0    0    pacientes_paci_codigo_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.pacientes_paci_codigo_seq OWNED BY public.pacientes.paci_codigo;
          public          postgres    false    206            �            1259    32779    usuarios    TABLE     �   CREATE TABLE public.usuarios (
    usu_cod integer NOT NULL,
    usu_nome character varying(30),
    usu_senha character varying(15),
    usu_tipo character varying(30)
);
    DROP TABLE public.usuarios;
       public         heap    postgres    false            �            1259    32777    usuarios_usu_cod_seq    SEQUENCE     �   CREATE SEQUENCE public.usuarios_usu_cod_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.usuarios_usu_cod_seq;
       public          postgres    false    203            �           0    0    usuarios_usu_cod_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.usuarios_usu_cod_seq OWNED BY public.usuarios.usu_cod;
          public          postgres    false    202            8           2604    57367    bairro baicodigo    DEFAULT     t   ALTER TABLE ONLY public.bairro ALTER COLUMN baicodigo SET DEFAULT nextval('public.bairro_baicodigo_seq'::regclass);
 ?   ALTER TABLE public.bairro ALTER COLUMN baicodigo DROP DEFAULT;
       public          postgres    false    204    205    205            6           2604    16400    medicos cod_medico    DEFAULT     x   ALTER TABLE ONLY public.medicos ALTER COLUMN cod_medico SET DEFAULT nextval('public.medicos_cod_medico_seq'::regclass);
 A   ALTER TABLE public.medicos ALTER COLUMN cod_medico DROP DEFAULT;
       public          postgres    false    200    201    201            9           2604    57384    pacientes paci_codigo    DEFAULT     ~   ALTER TABLE ONLY public.pacientes ALTER COLUMN paci_codigo SET DEFAULT nextval('public.pacientes_paci_codigo_seq'::regclass);
 D   ALTER TABLE public.pacientes ALTER COLUMN paci_codigo DROP DEFAULT;
       public          postgres    false    206    207    207            :           2604    57389    pacientes paci_baicodigo    DEFAULT     �   ALTER TABLE ONLY public.pacientes ALTER COLUMN paci_baicodigo SET DEFAULT nextval('public.pacientes_paci_baicodigo_seq'::regclass);
 G   ALTER TABLE public.pacientes ALTER COLUMN paci_baicodigo DROP DEFAULT;
       public          postgres    false    208    207            7           2604    32782    usuarios usu_cod    DEFAULT     t   ALTER TABLE ONLY public.usuarios ALTER COLUMN usu_cod SET DEFAULT nextval('public.usuarios_usu_cod_seq'::regclass);
 ?   ALTER TABLE public.usuarios ALTER COLUMN usu_cod DROP DEFAULT;
       public          postgres    false    202    203    203            �          0    57364    bairro 
   TABLE DATA           4   COPY public.bairro (baicodigo, bainome) FROM stdin;
    public          postgres    false    205   �)       �          0    16397    medicos 
   TABLE DATA           ]   COPY public.medicos (cod_medico, nome_medico, especializacao_medico, crm_medico) FROM stdin;
    public          postgres    false    201   ]*       �          0    57381 	   pacientes 
   TABLE DATA           �   COPY public.pacientes (paci_codigo, paci_nome, paci_nasci, paci_rg, paci_telefone, paci_rua, paci_cep, paci_complemento, paci_baicodigo) FROM stdin;
    public          postgres    false    207   j+       �          0    32779    usuarios 
   TABLE DATA           J   COPY public.usuarios (usu_cod, usu_nome, usu_senha, usu_tipo) FROM stdin;
    public          postgres    false    203   �+       �           0    0    bairro_baicodigo_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.bairro_baicodigo_seq', 11, true);
          public          postgres    false    204            �           0    0    medicos_cod_medico_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.medicos_cod_medico_seq', 23, true);
          public          postgres    false    200            �           0    0    pacientes_paci_baicodigo_seq    SEQUENCE SET     K   SELECT pg_catalog.setval('public.pacientes_paci_baicodigo_seq', 1, false);
          public          postgres    false    208            �           0    0    pacientes_paci_codigo_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.pacientes_paci_codigo_seq', 1, false);
          public          postgres    false    206            �           0    0    usuarios_usu_cod_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.usuarios_usu_cod_seq', 15, true);
          public          postgres    false    202            @           2606    57395    bairro bairro_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.bairro
    ADD CONSTRAINT bairro_pkey PRIMARY KEY (baicodigo);
 <   ALTER TABLE ONLY public.bairro DROP CONSTRAINT bairro_pkey;
       public            postgres    false    205            <           2606    16402    medicos medicos_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.medicos
    ADD CONSTRAINT medicos_pkey PRIMARY KEY (cod_medico);
 >   ALTER TABLE ONLY public.medicos DROP CONSTRAINT medicos_pkey;
       public            postgres    false    201            B           2606    57386    pacientes pacientes_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.pacientes
    ADD CONSTRAINT pacientes_pkey PRIMARY KEY (paci_codigo);
 B   ALTER TABLE ONLY public.pacientes DROP CONSTRAINT pacientes_pkey;
       public            postgres    false    207            >           2606    32784    usuarios usuarios_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (usu_cod);
 @   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuarios_pkey;
       public            postgres    false    203            C           2606    57396 '   pacientes pacientes_paci_baicodigo_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.pacientes
    ADD CONSTRAINT pacientes_paci_baicodigo_fkey FOREIGN KEY (paci_baicodigo) REFERENCES public.bairro(baicodigo) NOT VALID;
 Q   ALTER TABLE ONLY public.pacientes DROP CONSTRAINT pacientes_paci_baicodigo_fkey;
       public          postgres    false    207    205    2880            �   p   x�M�=
A�:�)r��ןr��JV��	N��0��h��+�W�]�Ov�t�����5M�,:Im����f����A"[彖�fŎ��m<�&H�_��FJ�%���B$E      �   �   x�m�Mn� ��3�����e��,*�鲛Q ����B]��XI�Q�5���o*xM�����G4s �U��iZ���M)
Gb�O��9�g�/s
ni�γLp�y�9�������s���%b?�+ԭmjl
5�BסF��Pl�<~�v���L%��*ej�5<����_�D�a����|�+Y (��(�������ɩmPZxԯ3<ǃ������Ҩ��`��_i=����c�~��jm�M-�� �~j��      �      x������ � �      �   �   x�m�=�0Fg�>"�Y�*f�d��ĕ[Nԉs�bP'������E�E)D����r�b
�i;��3�W<��w�!K�i6j�pN\vW-x��pُv�ْN��\_9�!�̵����e��ы�5����J��&.��v@��L/     