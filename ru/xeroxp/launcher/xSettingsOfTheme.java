package ru.xeroxp.launcher;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class xSettingsOfTheme {
    public static xServer[] Servers = {
       new xServer(0, "Classic", "localhost", "25565", "hitech", "minecraft.jar", "1.5.2", 100, 0, 0, 724, 110, 6, 6, 180, 98, 500, 30, 200, 24, new Color(114, 114, 114), 450, 78, 70, 14, new Color(114, 114, 114), 231, 71, 484.0D, 29),
       new xServer(1, "Hitech", "localhost", "25565", "sandbox", "minecraft.jar", "1.4.7", 100, 0, 120, 724, 110, 6, 126, 180, 98, 500, 150, 200, 24, new Color(114, 114, 114), 450, 198, 70, 14, new Color(114, 114, 114), 231, 191, 484.0D, 29),
       new xServer(2, "Rpg", "localhost", "25565", "new", "minecraft.jar", "1.6.0", 100, 0, 240, 724, 110, 6, 246, 180, 98, 500, 270, 200, 24, new Color(114, 114, 114), 450, 318, 70, 14, new Color(114, 114, 114), 231, 311, 484.0D, 29),
       new xServer(3, "Sandbox", "localhost", "25565", "", "minecraft.jar", "1.4.7", 80, 0, 360, 724, 110, 6, 366, 180, 98, 500, 390, 200, 24, new Color(114, 114, 114), 450, 438, 70, 14, new Color(114, 114, 114), 231, 431, 484.0D, 29),
       new xServer(4, "Rpg", "localhost", "25565", "", "minecraft.jar", "1.4.7", 100, 0, 480, 724, 110, 6, 486, 180, 98, 500, 510, 200, 24, new Color(114, 114, 114), 450, 558, 70, 14, new Color(114, 114, 114), 231, 551, 484.0D, 29),
       new xServer(5, "Classic", "localhost", "25565", "", "minecraft.jar", "1.4.7", 100, 0, 600, 724, 110, 6, 606, 180, 98, 500, 630, 200, 24, new Color(114, 114, 114), 450, 678, 70, 14, new Color(114, 114, 114), 231, 671, 484.0D, 29),
       new xServer(6, "Hitech", "localhost", "25565", "", "minecraft.jar", "1.4.7", 100, 0, 720, 724, 110, 6, 726, 180, 98, 500, 750, 200, 24, new Color(114, 114, 114), 450, 798, 70, 14, new Color(114, 114, 114), 231, 791, 484.0D, 29),
       new xServer(7, "Classic", "localhost", "25565", "", "minecraft.jar", "1.4.7", 80, 0, 840, 724, 110, 6, 846, 180, 98, 500, 870, 200, 24, new Color(114, 114, 114), 450, 918, 70, 14, new Color(114, 114, 114), 231, 911, 484.0D, 29),
       new xServer(8, "Sandbox", "localhost", "25565", "", "minecraft.jar", "1.4.7", 100, 0, 960, 724, 110, 6, 966, 180, 98, 500, 990, 200, 24, new Color(114, 114, 114), 450, 1038, 70, 14, new Color(114, 114, 114), 231, 1031, 484.0D, 29)
   }; //id, ��������(��������� ���� ������ � �������� ��������), ip, port, ��������, ������, ������, ������������ ���������� ������ �������, ���������� � �������, ����� �������
   public static xLabel[] Labels = {
       new xLabel(0, "����", new Color(63, 63, 63), 593, 65, 100, 14, "http://author-xeroxp.ru/"),
       new xLabel(1, "�����������", new Color(63, 63, 63), 593, 98, 100, 14, "http://author-xeroxp.ru/registration/"),
       new xLabel(2, "������ �������", new Color(63, 63, 63), 593, 131, 150, 14, "http://author-xeroxp.ru/lk/"),
       new xLabel(3, "�����", new Color(63, 63, 63), 593, 164, 100, 14, "http://author-xeroxp.ru/forum/")
   }; //id, ��������, ����, ���������� � ������� ������, ���� ������
    public static xButton[] Buttons = {
        new xButton(0, "�������� ������", "update_button.png", "update_button_pressed.png", "update_button_disabled.png", 730, 448, 39, 39, "UL", ""),
        new xButton(1, "�����������", "auth_button.png", "auth_button_pressed.png", "auth_button.png", 545, 448, 178, 39, "JL", "JKL"),
        new xButton(2, "���������� � ������������ � ������ �������", "save_button.png", "save_button_pressed.png", "save_button.png", 730, 400, 39, 39, "RML", "")
    }; //id, ��������(� ������ ������ �� �� ��� �� ������), ��������, �������� ��� �������, �������� ��� ����������� ������, ���������� � �������, ����������(�� ������!!!)
    public static xCheckbox[] Checkboxes = {
        new xCheckbox(0, "��������� ������", 573, 331, 120, 14, new Color(63, 63, 63), "checkbox.png", "checkbox_select.png", 549, 331, 16, 16, "RPL"),
        new xCheckbox(1, "����� �������", 573, 364, 120, 14, new Color(63, 63, 63), "checkbox.png", "checkbox_select.png", 549, 364, 16, 16, "GML")
    }; //id, ��������(��������� ���� ������), ���������� � �������, ����, ��������, �������������� ��������, ���������� � �������, ����������(�� ������!!!)
    public static xHeaderButton[] HeaderButtons = {
        new xHeaderButton(0, "exit", "exit_button.png", "exit_button.png", 775, 6, 14, 14),
        new xHeaderButton(1, "minimize", "minimize_button.png", "minimize_button.png", 745, 6, 14, 14)
    }; //id, ��������(�� ������!!!), ��������, �������� ��� ���������, ���������� � �������
    public static xTextField[] Fields = {
        new xTextField(0, "�����", new Color(114, 114, 114), 20, 560, 232, 200, 14, "login_field.png"),
        new xTextField(1, "������", new Color(114, 114, 114), 26, 560, 281, 200, 14, "password_field.png"),
        new xTextField(2, "������", new Color(114, 114, 114), 6, 560, 411, 120, 20, "memory_field.png")
    }; //id, ��������(�� ������!!!), ����, ������������ ���������� ��������, ���������� � �������, ��������
    public static int[] LoginFieldBounds = {549, 225}; //���������� �������� ��� ������
    public static int[] PasswordFieldBounds = {549, 273}; //���������� �������� ��� ������
    public static int[] MemoryFieldBounds = {547, 405}; //���������� �������� ��� ������
    
    public static int[] LauncherSize = {800, 599}; //������ ��������
    public static String FontFile1 = "arial.ttf"; //�������� ����� ������� ������
    public static String FontFile2 = "MyriadPro.otf"; //�������� ����� ������� ������
    public static String ClickButtonSound = "click.wav"; //�������� ����� ����� �����
    public static String MainPanelBackgroundImage = "launcher_bg.png"; //�������� ���� ������� ������ ��������
    public static float[] MainFonts = {12.0F, 12.0F}; //������� ������� � ������� ������
    
    public static String Logo = "logo.png"; //��������-����
    public static int[] LogoBounds = {50, 70}; //���������� ����
    
    public static int[] HeaderBounds = {20, 5, 200, 14}; //���������� ������ �� ����� (������)
    public static Color HeaderColor = new Color(114, 114, 114); //���� ������ �� ����� (������)
    
    public static int[] ErrorLabelBounds = {485, 513, 300, 14}; //���������� ������ ���������� � ����� (���, ��� ������� "�����������...")
    public static Color ErrorLabelColor = new Color(63, 63, 63); //���� ����� ������ ���������� � �����
    
    public static int[] PercentLabelBounds = {360, 542, 200, 15}; //���������� ������ � ���������� (�� ������ ��������)
    public static Color PercentLabelColor = new Color(114, 114, 114); //���� ������ ������ � ����������
    
    public static String MemoryLabelText = "mb"; //������� � ������ ������ ������
    public static int[] MemoryLabelBounds = {690, 410, 20, 20}; //���������� ������� � ������ ������ ������
    public static Color MemoryLabelColor = new Color(114, 114, 114); //���� ������ ������� � ������ ������ ������
    
    public static String[] ScrollbarImages = {"scrollbar.png", "scrollbar_bg.png"}; //�������� ������ ���������
    
    public static int[] NewsScrollBarSize = {12,30}; //������� ������ ��������� ��������
    //���� �������� ������������� �������
    public static String[] NewsButtonIcons = {"news_button.png", "news_button.png", "news_button_disabled.png"}; //�������� ������ ��������
    public static int[] NewsButtonBounds = {0, 0, 50, 279}; //���������� � ������� ������ ��������
    public static int NewsPanelHeight1 = 279; //������ ������ ��������
    public static int NewsPanelWidth1 = 330; //������ ������ ��������
    public static int NewsPanelY1 = 180; //��������� ������ �������� �� ������
    public static Color NewsPanelBgColor1 = new Color(0, 0, 0, 100); //���� ���� ������ ��������
    public static String NewsBgImage = "news_panel.png"; //�������� ���� ������ ��������
    //���� ��������� ������������� �������
    public static int NewsPanelHeight2 = 305; //������ ������ ��������
    public static int NewsPanelWidth2 = 430; //������ ������ ��������
    public static int NewsPanelY2 = 180; //��������� ������ �������� �� ������
    public static int NewsPanelX2 = 50; //��������� ������ �������� �� ������
    public static Color NewsPanelBgColor2 = new Color(0, 0, 0, 50); //���� ���� ������ ��������
    
    public static String ServersPanelBackgroundImage = "servers_bg.png"; //�������� ������ ������ ��������
    public static String[] ServersImages = {"serverinfobox.png", "serverinfobox_pressed.png"}; //�������� ������� ��������
    public static String[] ServersBarImages = {"serverbar_on.png", "serverbar_off.png", "serverbar_bg.png"}; //�������� ������ ������������� ��������
    public static float[] ServersFonts = {12.0F, 16.0F, 24.0F}; //������� ������� ������ ��������
    public static int[] ServersScrollPanelBounds = {20, 65, 760, 495}; //���������� ������ � ��������� � ������ ������ ��������
    public static int[] ServersInScrollPanelSize = {740, xSettingsOfTheme.Servers.length * 120}; //������� ����� � ���������
    public static int[] ServersScrollBarSize = {17, 479}; //������� ������ ��������� ������ ��������
    
    public static int[] ErrorPanelSize = {500, 200}; //������� ���� ������ (��������� � ����� ����)
    public static Color ErrorPanelTextColor = Color.red; //���� ������ � ���� ������
    public static float ErrorPanelTextSize = 20.0F; //������ ������ � ���� ������
    public static String ErrorPanelImage = "errorpanel.png"; //��� � ���� ������
}