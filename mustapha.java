        String Password= jPassword.getText();
        String Email= txtUsername.getText();
        if(Password.contains("Eb33080859") && (Email.contains("mstaphawekesa@gmail.com")))
        {
            txtUsername.setText(null);
            jPassword.setText(null);
            systemExit();
            Home info = new Home();
            info.setVisible(true);
        }
        else
        {
           JOptionPane.showMessageDialog(null, "Wrong Username", "Password",JOptionPane.ERROR_MESSAGE);
            txtUsername.setText(null);
            jPassword.setText(null);
        }