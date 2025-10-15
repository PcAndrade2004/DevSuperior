-- ATENÇÃO: Use este script no seu arquivo de seeding (ex: import.sql)

-- 1. Inserção na tabela TB_CATEGORY
INSERT INTO TB_CATEGORY (id, description) VALUES (1, 'Curso');
INSERT INTO TB_CATEGORY (id, description) VALUES (2, 'Oficina');

-- 2. Inserção na tabela TB_ACTIVITIES
-- Assumindo que sua entidade Atividade tem o FK 'categoria_id'
INSERT INTO TB_ACTIVITIES (id, name, description, price, categoria_id) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO TB_ACTIVITIES (id, name, description, price, categoria_id) VALUES (2, 'Oficina de Github', 'Controle versões de seus projetos', 50.00, 2);

-- 3. Inserção na tabela TB_BLOCK (Com as colunas 'inicio' e 'fim' corrigidas)
INSERT INTO TB_BLOCK (id, inicio, fim) VALUES (1, '2017-09-25 08:00:00', '2017-09-25 11:00:00');
INSERT INTO TB_BLOCK (id, inicio, fim) VALUES (2, '2017-09-25 14:00:00', '2017-09-25 18:00:00');
INSERT INTO TB_BLOCK (id, inicio, fim) VALUES (3, '2017-09-26 08:00:00', '2017-09-26 11:00:00');

-- 4. Inserção na tabela TB_PARTICIPANT
INSERT INTO TB_PARTICIPANT (id, name, email) VALUES (1, 'José Silva', 'jose@gmail.com');
INSERT INTO TB_PARTICIPANT (id, name, email) VALUES (2, 'Tiago Faria', 'tiago@gmail.com');
INSERT INTO TB_PARTICIPANT (id, name, email) VALUES (3, 'Maria do Rosário', 'maria@gmail.com');
INSERT INTO TB_PARTICIPANT (id, name, email) VALUES (4, 'Teresa Silva', 'teresa@gmail.com');

-- 5. Inserção na tabela de ligação TB_ACTIVITIES_BLOCKS (Relacionamento Atividade <-> Bloco)
INSERT INTO TB_ACTIVITIES_BLOCKS (activities_id, blocks_id) VALUES (1, 1);
INSERT INTO TB_ACTIVITIES_BLOCKS (activities_id, blocks_id) VALUES (2, 2);
INSERT INTO TB_ACTIVITIES_BLOCKS (activities_id, blocks_id) VALUES (2, 3);

-- 6. Inserção na tabela de ligação TB_PARTICIPANT_ACTIVITY (Relacionamento Participante <-> Atividade)
INSERT INTO TB_PARTICIPANT_ACTIVITY (participant_id, activity_id) VALUES (1, 1);
INSERT INTO TB_PARTICIPANT_ACTIVITY (participant_id, activity_id) VALUES (1, 2);
INSERT INTO TB_PARTICIPANT_ACTIVITY (participant_id, activity_id) VALUES (2, 1);
INSERT INTO TB_PARTICIPANT_ACTIVITY (participant_id, activity_id) VALUES (3, 1);
INSERT INTO TB_PARTICIPANT_ACTIVITY (participant_id, activity_id) VALUES (3, 2);
INSERT INTO TB_PARTICIPANT_ACTIVITY (participant_id, activity_id) VALUES (4, 2);