```text
 ██████╗██╗   ██╗██████╗ ███████╗██████╗ ███████╗███████╗███╗   ██╗
██╔════╝╚██╗ ██╔╝██╔══██╗██╔════╝██╔══██╗╚══███╔╝██╔════╝████╗  ██║
██║      ╚████╔╝ ██████╔╝█████╗  ██████╔╝  ███╔╝ █████╗  ██╔██╗ ██║
██║       ╚██╔╝  ██╔══██╗██╔══╝  ██╔══██╗ ███╔╝  ██╔══╝  ██║╚██╗██║
╚██████╗   ██║   ██████╔╝███████╗██║  ██║███████╗███████╗██║ ╚████║
 ╚═════╝   ╚═╝   ╚═════╝ ╚══════╝╚═╝  ╚═╝╚══════╝╚══════╝╚═╝  ╚═══╝
```

<div align="left">
  <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">┌─[cyberzen@terminal]─[~]</code><br>
  <code style="color: #98FB98; font-size: 12px; font-family: 'Share Tech Mono', monospace;">└──$ ▸ systemctl status zen</code><br>
  <code style="color: #FFB6C1; font-size: 12px; font-family: 'Courier New', monospace;">  ▸ CYBERZEN ONLINE</code><br>
  <code style="color: #FFB6C1; font-size: 12px; font-family: 'Courier New', monospace;">  ▸ READY FOR PRACTICE</code>
</div>
<br>
<div align="left">
  <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">┌─[ REQUIREMENTS ]─</code><br>
  <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">│</code>
</div>
<div align="left">
  <table style="background: #0a0a0f; border: 1px solid #FF69B4; border-radius: 8px;">
    <thead>
      <tr>
        <th style="color: #FF69B4; padding: 8px 12px; font-family: 'Share Tech Mono', monospace;">TOOL</th>
        <th style="color: #FF69B4; padding: 8px 12px; font-family: 'Share Tech Mono', monospace;">VERSION</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td style="color: #FFB6C1; padding: 6px 12px; font-family: 'Courier New', monospace;">Docker</td>
        <td style="color: #98FB98; padding: 6px 12px; font-family: 'Courier New', monospace;">Latest</td>
      </tr>
      <tr>
        <td style="color: #FFB6C1; padding: 6px 12px; font-family: 'Courier New', monospace;">Java</td>
        <td style="color: #98FB98; padding: 6px 12px; font-family: 'Courier New', monospace;">25+</td>
      </tr>
      <tr>
        <td style="color: #FFB6C1; padding: 6px 12px; font-family: 'Courier New', monospace;">Maven</td>
        <td style="color: #98FB98; padding: 6px 12px; font-family: 'Courier New', monospace;">3.9+</td>
      </tr>
    </tbody>
  </table>
</div>
<div align="left">
  <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">┌─[cyberzen@terminal]─[~]</code><br>
  <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">└──$ ▸ java --version</code><br>
  <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;">  openjdk 25.0.1 2025-10-21 LTS</code>
</div>
<div align="left">
  <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">┌─[cyberzen@terminal]─[~]</code><br>
  <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">└──$ ▸ mvn --version</code><br>
  <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;">  Apache Maven 3.9.11</code>
</div>
<br>
<div align="left"> <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">┌─[ BOOT SEQUENCE ]─</code><br> <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">│</code> </div><div align="left"> <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">┌─[cyberzen@terminal]─[~/cyberzen]</code><br> <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">└──$ ▸ docker-compose up -d</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;"> [+] Running 3/3</code><br> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;"> ✔ Network cyberzen_default Created</code><br> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;"> ✔ Volume cyberzen_postgres-data Created</code><br> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;"> ✔ Container cyberzen-database Started</code> </div><div style="background: #0a0a0f; border-left: 3px solid #FF69B4; padding: 10px 12px; margin: 8px 0; border-radius: 4px;"> <code style="color: #98FB98; font-family: 'Courier New', monospace; font-size: 10px;"> ▸ Database: cyberzen_db<br> ▸ Username: cyberzen<br> ▸ Password: cyberzen<br> ▸ Port: 5432 </code> </div><div align="left"> <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">┌─[cyberzen@terminal]─[~/cyberzen]</code><br> <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">└──$ ▸ mvn spring-boot:run</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;"> [INFO] Started CyberZenApplication in 3.345 seconds</code> </div>
<br>
<div align="left"> <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">┌─[ ACCESS ]─</code><br> <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">│</code> </div><div align="left"> <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">┌─[cyberzen@terminal]─[~/cyberzen]</code><br> <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">└──$ ▸ cat .access-token</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;"> Using generated security password: xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;"> ⚠️ Changes every reboot</code> </div><div align="left"> <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">┌─[cyberzen@terminal]─[~/cyberzen]</code><br> <code style="color: #98FB98; font-size: 11px; font-family: 'Share Tech Mono', monospace;">└──$ ▸ open http://localhost:8080</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;"> USER: user</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;"> PASS: [your-token]</code> </div>
<br>
<div align="left"> <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">┌─[ COMMANDS ]─</code><br> <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">│</code> </div><div align="left"> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;"># Start everything</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;">$ docker-compose up -d && mvn spring-boot:run</code> </div><div align="left"> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;"># Stop database (keep data)</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;">$ docker-compose down</code> </div><div align="left"> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;"># Reset everything (wipe all data)</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;">$ docker-compose down -v</code> </div><div align="left"> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;"># Run tests</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;">$ mvn test</code> </div><div align="left"> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;"># Build JAR</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;">$ mvn clean package</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;">$ java -jar target\cyberzen-1.0-SNAPSHOT.jar</code> </div>
<br>
<div align="left"> <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">┌─[ CONTRIBUTE ]─</code><br> <code style="color: #FF69B4; font-size: 13px; font-family: 'Share Tech Mono', monospace;">│</code> </div><div align="left"> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;">1. Fork the repository</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;">2. git switch -c feature/......</code><br> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;">3. git commit -m "......"</code><br> <code style="color: #FFB6C1; font-size: 10px; font-family: 'Courier New', monospace;">4. git push origin feature/......</code><br> <code style="color: #98FB98; font-size: 10px; font-family: 'Courier New', monospace;">5. Open a Pull Request</code> </div>