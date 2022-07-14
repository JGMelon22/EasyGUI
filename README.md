# Easy GUI
Uma simples interface gráfica usando JFrame com o intuito de atualizar sistemas com base Ubuntu (apt + flatpak) e iniciar o SQL Server via Docker.

# Como usar?
- Baixe os scripts shell disponibilizados e os dê permissão de execução;
- Nas classes _StartStopMSSQL_ e _UpdateUbuntu_, aponte para o diretório onde foi posto os scripts;
- Compile e rode.

# Ilustração

![Screenshot from 2022-07-13 22-00-50](https://user-images.githubusercontent.com/73988556/178863942-e23bd91c-33de-4df1-9d86-2379b46e922e.png)

# Dependências
- Java 17;
- Mover os scripts shell disponibilizados para a /home da distro em uso.

Obs: para esse pequeno projeto, foi utilizado a IDE IntelliJ e o OpenJDK-17<br>
Obs2: talvez seja necessário mudar o nome do container do SQL Server no script shell
