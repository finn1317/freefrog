;
; Copyright © 2014 Courage Labs
;
; This file is part of Freefrog.
;
; Freefrog is free software: you can redistribute it and/or modify
; it under the terms of the GNU Affero General Public License as published by
; the Free Software Foundation, either version 3 of the License, or
; (at your option) any later version.
;
; Freefrog is distributed in the hope that it will be useful,
; but WITHOUT ANY WARRANTY; without even the implied warranty of
; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
; GNU Affero General Public License for more details.
;
; You should have received a copy of the GNU Affero General Public License
; along with this program.  If not, see <http://www.gnu.org/licenses/>.
;

(ns freefrog.persistence)

(defn new-governance-log 
  "Creates a new governance log for the circle using the given input log.
  Returns the unique ID of this newly created governance log."
  [circle-id log])

(defn get-governance-log
  "Return the specified governance log for the circle. Throws
  EntityNotFoundException if the specified log or circle does not exist."
  [circle-id log-id])

(defn put-governance-log
  "Store the governance log for the specified circle and ID. Throws
  EntityNotFoundException if the specified log or circle does not exist."
  [circle-id log-id log])

(defn get-all-governance-logs
  "Return a collection of all of the governance logs for the circle. Throws
  EntityNotFoundException if the circle does not exist."
  [circle-id])

(defn new-user 
  "Creates a new user using the given input user data. Returns the unique ID of
  this newly created governance log."
  [user-data])

(defn get-user 
  "Returns the specified user. Throws EntityNotFoundException if the user does
  not exist."
  [user-id])
