Feature: TutorialPointStudentForm

  Scenario: Student form - gender radiobutton check
    Given Uzivatel je na strance tutorial point student form
    When Uzivatel zada sve jmeno "Honza"
    And Uzivatel zada svuj email "email@email.cz"
    And Uzivatel klikne na pohlavi male
    Then Radiobutton male je zasktnuty
    When Uzivatel klikne na pohlavi female
    Then Radiobutton male je odskrtnuty