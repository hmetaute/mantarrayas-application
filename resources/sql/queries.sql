-- :name create-club-member! :! :n
-- :doc creates a new register for a member to the club
INSERT INTO club_members
(id, first_name, last_name, email, pass)
VALUES (:id, :first_name, :last_name, :email, :pass)

-- :name update-user! :! :n
-- :doc updates an existing user record
UPDATE users
SET first_name = :first_name, last_name = :last_name, email = :email
WHERE id = :id

-- :name get-club-members :? :n
-- :doc retrieves a user record given the id
SELECT * FROM club_members

-- :name delete-user! :! :n
-- :doc deletes a user record given the id
DELETE FROM users
WHERE id = :id
