## ⚙ Requisitos para o projeto DivideAi

### **Requisitos Funcionais**

#### **Gerenciamento de Tarefas:**
- **Adicionar, remover, atualizar e marcar tarefas como concluídas.**
- **Visualizar lista de tarefas pendentes e concluídas.**
- **Definir prioridades para as tarefas.**
- **Tarefas Compartilhadas:** Possibilidade de criar e atribuir tarefas a diferentes membros da residência.
- **Notificações de Colaboração:** Notificações para todos os membros da residência sobre tarefas compartilhadas.

#### **Gerenciamento de Despesas:**
- **Registrar despesas incluindo descrição, valor e data.**
- **Categorizar as despesas (aluguel, contas, alimentação, etc.).**
- **Visualizar histórico de despesas por período (diário, semanal, mensal).**
- **Despesas Compartilhadas:** Registro de despesas comuns, permitindo a divisão proporcional dos custos entre os moradores.
- **Resumo de Despesas Compartilhadas:** Visualizar total de despesas compartilhadas e individuais.
- **Controle de Contribuições:** Controle das contribuições de cada membro para despesas compartilhadas.

#### **Alertas e Notificações:**
- **Alertar sobre tarefas próximas do prazo ou despesas excedendo um limite definido.**
- **Opção para configurar lembretes personalizados.**
- **Notificações Compartilhadas:** Alertas para todos os membros da residência sobre despesas compartilhadas e tarefas pendentes.
- **Lembretes de Pagamento de Despesas:** Lembretes sobre o vencimento de despesas compartilhadas.

#### **Relatórios:**
- **Gerar relatórios sobre tarefas concluídas, despesas por categoria, etc.**
- **Visualização gráfica dos dados para análise mais fácil.**
- **Relatórios de Grupo:** Gerar relatórios detalhados sobre tarefas e despesas compartilhadas por todos os moradores.
- **Análise de Participação:** Visualização gráfica da participação de cada membro nas tarefas e despesas.

#### **Personalização:**
- **Opções para personalizar categorias de despesas e prioridades de tarefas.**

### **Requisitos Não Funcionais**

#### **Desempenho:**
- **Resposta rápida do sistema mesmo com grande volume de dados.**
- **Eficiência no uso de recursos de hardware.**
- **Escalabilidade:** Capacidade do sistema para gerenciar um número crescente de usuários e dados sem degradação de desempenho.
- **Sincronização em Tempo Real:** Atualização em tempo real das tarefas e despesas entre diferentes dispositivos dos membros da residência.

#### **Usabilidade:**
- **Interface intuitiva e fácil de usar.**
- **Suporte para diferentes dispositivos (computadores, tablets, smartphones).**
- **Interface Multilíngue:** Suporte a múltiplos idiomas para facilitar o uso por diferentes membros.

#### **Manutenção:**
- **Código bem estruturado e modular para facilitar futuras atualizações e adições de funcionalidades.**
- **Comentários adequados para facilitar a compreensão do código.**


### 💡**Ideias Adicionais**

- **Pedia ao código para mandar separadamente a lista de cada pessoa estando pendente e outra para concluídos.**

### **Interface Gráfica:**

- **JavaFX ou Swing para desenvolvimento da interface de usuário.**
- **Bibliotecas de UI Responsiva:** Uso de bibliotecas modernas para criação de interfaces responsivas, como React Native para mobile.

### **Banco de Dados:**

- **SQLite para armazenamento local dos dados ou MySQL/PostgreSQL para armazenamento em servidor, dependendo do escopo e necessidades do projeto.**
- **Sincronização Cloud:** Uso de serviços como Firebase para sincronização em tempo real de dados entre dispositivos.

### **Colaboração e Compartilhamento:**

- **Integração com Calendários:** Integração com calendários como Google Calendar e Outlook para sincronização de tarefas e eventos.
