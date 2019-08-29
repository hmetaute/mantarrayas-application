(ns mantarrayas-backend.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [mantarrayas-backend.core-test]))

(doo-tests 'mantarrayas-backend.core-test)

