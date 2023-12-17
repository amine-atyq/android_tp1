# Travaux Pratiques : GINF3 (2023/2024)
## Développement Mobile sous Android Studio

### Description
This repository contains the code and resources for the Android mobile application assignment for the GINF3 course during the academic year 2023/2024. The assignment involves creating a basic Android application using Android Studio, focusing on XML layout design and event handling.

### Assignment Details
- **Application Name**: My Application
- **Main Activity**: MainActivity
- **Design**: The interface design should resemble the provided example layout, using a combination of vertical and horizontal LinearLayouts. A ScrollView should be used to accommodate longer interfaces.
- **ImageView**: Insert an ImageView in the layout to display the ENSAT logo from the drawable resources.
- **Toast Messages**: Display welcome messages using Toast messages when the "Bienvenue" button is clicked. Messages should include the student's name, surname, and age.
- **EditText**: Display the welcome message in an EditText field called "txtBienvenue" instead of using Toast messages.
- **RadioButtons**: The "Filière" button should display the selected radio button's value.
- **Checkbox**: The "Etat Familial" button should display whether the "Marié" checkbox is checked or not.

### Resources
- Make sure to add all necessary resources, including strings, colors, and dimensions, in the following XML resource files: `Values/strings.xml`, `Values/colors.xml`, and `Values/dimen.xml`.
- Create a resource file for Arabic language strings and test the result by changing the emulator's language setting.

### Styles
Define styles for text fields and buttons in your layout to maintain consistency.

### Event Handling
Here's an example of how to handle the click event for the "Etat Familial" button:

```java
btnEtat.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (chkMarie.isChecked())
            Toast.makeText(SecondActivity.this, "Vous êtes marié", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(SecondActivity.this, "Vous êtes célibataire", Toast.LENGTH_LONG).show();
    }
});
