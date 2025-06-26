Feature: TutorialPointStudentForm

  Scenario: Student form - gender radiobutton check
    Given Uzivatel je na strance tutorial point student form
    When Uzivatel zada sve jmeno "Honza"
    And Uzivatel zada svuj email "email@email.cz"
    And Uzivatel klikne na pohlavi "male"
    Then Radiobutton male je zasktnuty
    When Uzivatel klikne na pohlavi "female"
    Then Radiobutton male je odskrtnuty

  Scenario: Student form - ukazka
    Given Uzivatel je na strance tutorial point student form
    When Uzivatel zada sve jmeno "Tereza"
    And Uzivatel klikne na pohlavi "female"

  Scenario Outline: Student form vicero dat
    Given Uzivatel je na strance tutorial point student form
    When Uzivatel zada sve jmeno "<jmeno>"
    And Uzivatel klikne na pohlavi "<pohlavi>"
    Examples:
      | jmeno | pohlavi |
      | Petra | female  |
      | Jenda | male    |
      | Katka | female  |