package ru.xeroxp.launcher;

import java.awt.Color;

public class xSettings {
   public static String siteLink = "http://author-xeroxp.ru/"; //������ �� ������� �������� ����� 
   public static String mineFolder = "xeroxp_socket"; //����� � ������� ��������� ��������� (.minecraft) ��� �����
   public static String downLauncherLink = "http://localhost/3/launcher/"; //���� �� �����, � ������� ����� ������� (xLauncher.jar � xLauncher.exe)
   public static String downClientLink = "http://localhost/3/client/"; //���� �� �����, � ������� �������� client.zip (� ��� �������� ��� ����� ��������)
   public static String maininfofile = "http://localhost/3/maininfo.php"; //���� �� ����� ����������
   public static String LauncherName = "XeroXP Launcher"; //�������� ��������
   public static String monitorLink = "http://localhost/3/data/monitor.txt"; //������ �� ���� �����������
   public static int checkTime = 70000; //���������� �������� �������
   public static String gameName = "XeroXP Minecraft"; //�������� ���� ����
   public static String launcherVersion = "1.0.0"; //������ ��������
   public static String[] offlineClient = {"", "minecraft.jar", "1.4.7"}; //������, ������� ����� ����������� � ������� ������
   public static String newsUrl = "http://localhost/3/news.html"; //������ �� ���� � ���������
   public static String passidkey = "QWERTY1"; //���� ������ ������ (����� �� ������ ���� � �������)
   public static int localport = 6565; //���� �������� �������� �� �������
   public static byte[] key = {
       0x74, 0x68, 0x68, 0x73, 0x49, 0x73, 0x41, 0x53, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79
   }; //���� ������ ����������� ����� ��������� � �����-�������� (� �����-������� ������ ���� ����� ��)
   public static boolean animatednews = true; //������������ ���� ��������
   public static xServerConnect[] connectServers = {
       new xServerConnect(0, "192.168.10.3", 4444)
   }; //id, ip ����� � port �����-��������
   public static boolean patchDir = true; //������������ �������������� ������ ���������� ����
   public static String mcclass = "net.minecraft.client.Minecraft";
   public static String[] mcversions = {
       "1.2.5::aj", "1.3.x::am", "1.4.x::an", "1.5.x::an"
   }; //������ � ���������� ��� ������ ��� ���������� ����������� ����
}
