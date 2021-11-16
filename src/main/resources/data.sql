DROP TABLE IF EXISTS upr_uzenet;

CREATE TABLE upr_uzenet
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    dms_id     VARCHAR(250) unique NOT NULL,
    created_at DATE                NOT NULL
);

INSERT INTO upr_uzenet (dms_id, created_at)
VALUES ('7b98c050-462e-11ec-81d3-0242ac130003', '2021-11-15');
