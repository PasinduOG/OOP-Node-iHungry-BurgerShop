# iHungry Burger Shop - Advanced Edition

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Swing](https://img.shields.io/badge/Swing-GUI-blue?style=for-the-badge)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![MVC](https://img.shields.io/badge/Architecture-MVC-green?style=for-the-badge)](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)
[![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)](https://github.com/PasinduOG)

An advanced desktop application for managing burger shop operations, built with Java Swing GUI framework. This project showcases **custom Linked List data structure implementation** and **MVC (Model-View-Controller) architectural pattern**.

## 🌟 Project Vision

This will be an enhanced version of my [original iHungry Burger Shop](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop) project, implementing industry-standard design patterns and custom data structures to demonstrate advanced software engineering principles.

## 🎯 Features

### Implemented Features ✅

#### Core Order Management
- 🍔 **Place Order**: Add new burger orders with auto-generated order IDs (B0001, B0002, etc.)
- 📋 **Order Status Tracking**: Three status states (Processing, Delivered, Cancelled)
- � **Update Orders**: Modify existing orders and change order status
- 👥 **Customer Management**: Track customer phone numbers and names with duplicate detection
- 💰 **Pricing System**: Fixed burger price (₹500 per burger) with quantity-based calculations

#### Search & Query Features
- 🔍 **Search by Order ID**: Find specific orders using order ID
- 📱 **Search by Customer Phone**: Locate all orders for a customer
- 🏆 **Best Customer**: Identify customers with highest order quantities
- 📊 **Dashboard Analytics**: View total orders, customers, and delivered orders

#### View Management
- 📋 **Processing Orders**: View all orders currently being prepared
- 📦 **Delivered Orders**: Track all successfully delivered orders
- ❌ **Cancelled Orders**: Monitor cancelled orders

### Technical Implementation ✅
- **Custom Linked List**: Complete Node-based implementation with `add()`, `get()`, `set()`, `search()`, `indexOf()`, `size()`, `toArray()`, and `clear()` methods
- **MVC Architecture**: Clean separation with Model (BurgerOrder, BurgerList), View (MainPanel), Controller (BurgerOrderController)
- **OOP Principles**: Encapsulation with private fields and getters/setters, Inner Node class for data structure
- **Modern UI**: FlatLaf theme integration for professional look and feel
- **File I/O**: CSV-style persistent storage in BurgerOrders.txt with read/write operations
- **Input Validation**: Phone number validation (10 digits starting with 0)
- **Event-Driven Programming**: Button-based navigation with multiple panels and sidebars

## 🏗️ Architecture

### MVC Pattern

The project follows the **Model-View-Controller** architectural pattern:

- **Model Layer**: 
  - **`BurgerOrder.java`** - Entity class with encapsulated fields:
    - `orderId` (String) - Auto-generated format: B0001, B0002, etc.
    - `customerId` (String) - Customer phone number (10 digits)
    - `customerName` (String) - Customer name
    - `orderQty` (int) - Number of burgers ordered
    - `orderStatus` (int) - Status code (0=Cancelled, 1=Processing, 2=Delivered)
    - Includes getters/setters and CSV `toString()` method
    
  - **`BurgerList.java`** - Custom Linked List implementation:
    - Inner `Node` class with `BurgerOrder` data and `next` pointer
    - Methods: `add()`, `addFirst()`, `addLast()`, `get()`, `set()`, `indexOf()`, `search()`, `size()`, `toArray()`, `clear()`
    - Dynamic memory allocation with no size limitations
  
- **View Layer**: 
  - **`MainPanel.java`** - Comprehensive Swing GUI with:
    - Multiple navigation sidebars (Main, Search, View Orders)
    - Dashboard with analytics (order count, customer count, delivered count)
    - Place Order, Update Order, Search panels
    - Table displays for order management
    - FlatLaf theming for modern appearance
    - Color-coded buttons and interactive panels
  - **`MainPanel.form`** - NetBeans visual form designer file
  
- **Controller Layer**: 
  - **`BurgerOrderController.java`** - Business logic and file operations:
    - **Constants**: `BURGER_PRICE=500`, status codes (`CANCEL=0`, `PREPARING=1`, `DELIVERED=2`)
    - **Order ID Generation**: Sequential ID generation from file
    - **Validation**: `isValidPhoneNumber()` - checks 10-digit format starting with 0
    - **Duplicate Detection**: `isDuplicateCustomer()`, `getDuplicateCustomerName()`
    - **CRUD Operations**: `placeOrder()`, `searchBurgerOrder()`, `updateOrder()`, `loadAllOrders()`
    - **File I/O**: Reads/writes to BurgerOrders.txt in CSV format
    - **Status Management**: `getStatusNameById()` for status display names

## 🚀 Technologies Used

| Technology | Purpose |
|------------|---------|
| **Java SE 11** | Core programming language (JDK 11) |
| **Swing** | GUI framework for desktop interface |
| **FlatLaf 3.6.1** | Modern look-and-feel library (FlatMacLightLaf theme) |
| **FlatLaf IntelliJ Themes** | Enhanced UI theming |
| **Custom Linked List** | Node-based data structure for order management |
| **MVC Pattern** | Architectural design pattern |
| **OOP Concepts** | Software design principles |
| **File I/O** | CSV-style persistent data storage (BurgerOrders.txt) |
| **NetBeans** | IDE and GUI form builder |

## 📋 Requirements

- **Java Development Kit (JDK) 11** or higher
- **NetBeans IDE** (recommended for form editing) or any Java IDE
- **FlatLaf Libraries** (included in `lib/` folder):
  - `flatlaf-3.6.1.jar`
  - `flatlaf-intellij-themes-3.6.1.jar`

## 🚀 How to Run

### Option 1: Using NetBeans IDE (Recommended)

1. **Clone the repository**
   ```bash
   git clone https://github.com/PasinduOG/OOP-Node-iHungry-BurgerShop.git
   cd OOP-Node-iHungry-BurgerShop
   ```

2. **Open in NetBeans**
   - Open NetBeans IDE
   - File → Open Project
   - Navigate to and select the `OOP-Node-iHungry-BurgerShop` folder

3. **Build and Run**
   - Right-click on the project in the Projects panel
   - Select **"Clean and Build"** (or press Shift+F11)
   - Then select **"Run"** (or press F6)
   - The application window will launch automatically

### Option 2: Using Command Line

1. **Compile the project**
   ```bash
   # Windows (PowerShell/CMD)
   javac -cp "lib\*" -d build\classes src\burgerShop\model\*.java src\burgerShop\controller\*.java src\burgerShop\view\*.java
   ```

2. **Run the application**
   ```bash
   # Windows (PowerShell/CMD)
   java -cp "build\classes;lib\*" burgerShop.view.MainPanel
   ```

## 📖 Using the Application

### Main Features

1. **Dashboard**
   - View total orders, customer count, and delivered orders
   - Quick overview of system statistics

2. **Place Order**
   - Order ID is auto-generated (B0001, B0002, etc.)
   - Enter customer phone number (10 digits starting with 0)
   - System detects duplicate customers and auto-fills name
   - Enter burger quantity
   - Order is automatically set to "Processing" status

3. **Update Order**
   - Search by Order ID
   - View current order details
   - Update order status (Processing/Delivered/Cancelled)
   - Changes are saved immediately

4. **Search Orders**
   - Search by Order ID for specific order details
   - Search by Customer Phone to find all orders for a customer

5. **Best Customer**
   - View customer with highest total order quantity

6. **View Orders**
   - **Processing Orders**: See all orders being prepared
   - **Delivered Orders**: View completed deliveries
   - **Cancelled Orders**: Track cancelled orders

### Data Storage
- All orders are automatically saved to `BurgerOrders.txt` in the project root
- Format: `OrderID,CustomerPhone,CustomerName,Quantity,Status`
- Example: `B0001,0771234567,John Doe,5,1`
- Data persists between application sessions

## 🧩 OOP Concepts Demonstrated

| Concept | Implementation in Project |
|---------|---------------------------|
| **Encapsulation** | All fields in `BurgerOrder` are `private` with public getters/setters. Node class encapsulates order data and next pointer. |
| **Abstraction** | Clean separation between Model, View, and Controller layers. Controller hides file I/O complexity from View. |
| **Inner Classes** | `Node` class nested inside `BurgerList` - demonstrates class organization and data hiding. |
| **Data Structures** | Custom Linked List implementation from scratch with dynamic memory allocation. |
| **Static Methods** | Utility methods in `BurgerOrderController` (e.g., `generateOrderId()`, `isValidPhoneNumber()`) |
| **Constants** | Static final constants for burger price and status codes (`BURGER_PRICE`, `CANCEL`, `PREPARING`, `DELIVERED`) |
| **File I/O** | BufferedReader/FileWriter for persistent CSV-style data storage |
| **Separation of Concerns** | Each class has single responsibility - Model handles data, View handles UI, Controller handles logic |
| **Event-Driven Programming** | Button actions, panel switching, and user interactions through Swing events |

## 📊 Data Structure Implementation

### Custom Linked List (BurgerList)
The project implements a **hand-crafted Singly Linked List** from scratch without using Java Collections Framework:

#### Inner Node Class
```java
class Node {
    private BurgerOrder burgerOrder;  // Data
    private Node next;                // Pointer to next node
}
```

#### Implemented Methods

| Method | Description | Time Complexity |
|--------|-------------|-----------------|
| `add(BurgerOrder)` | Add order to end of list | O(n) |
| `addFirst(BurgerOrder)` | Add order to beginning | O(1) |
| `addLast(BurgerOrder)` | Add order to end | O(n) |
| `add(int index, BurgerOrder)` | Add order at specific position | O(n) |
| `get(int index)` | Retrieve order at index | O(n) |
| `set(BurgerOrder)` | Update existing order | O(n) |
| `indexOf(BurgerOrder)` | Find index by order object | O(n) |
| `search(String orderId)` | Find index by order ID | O(n) |
| `size()` | Count total orders | O(n) |
| `toArray()` | Convert to array | O(n) |
| `clear()` | Remove all orders | O(1) |
| `isEmpty()` | Check if list is empty | O(1) |

#### Key Features
- ✅ **No Java Collections**: Built from scratch using only Node and pointer logic
- ✅ **Dynamic Memory**: No fixed size - grows as needed
- ✅ **Traversal**: Iterative traversal using `temp` pointers
- ✅ **Index-based Access**: Support for positional insertion and retrieval
- ✅ **Search Capabilities**: Both object-based and ID-based search
- ✅ **Array Conversion**: Can convert to array for table display in GUI

#### Why Linked List?
- **Perfect for Order Queue**: Naturally represents a sequence of orders
- **Dynamic Growth**: No need to resize like arrays
- **Easy Insertions**: Efficient adding of new orders
- **Real-world Practice**: Understanding pointers and node-based structures

## 📝 Development Status

### Phase 1: Foundation ✅
- [x] Set up project structure
- [x] Implement Node class
- [x] Implement custom Linked List operations
- [x] Create BurgerOrder entity class

### Phase 2: MVC Implementation ✅
- [x] Design and implement Model layer (BurgerList, BurgerOrder)
- [x] Create View components with Swing (MainPanel)
- [x] Develop Controller logic (BurgerOrderController)
- [x] Connect MVC components

### Phase 3: Core Features ✅
- [x] Order management functionality (Add, Update, Delete)
- [x] Customer information system
- [x] Order status tracking (Preparing, Delivered, Cancelled)
- [x] Search functionality (by phone or order ID)
- [x] File persistence (BurgerOrders.txt)

### Phase 4: Enhancement & Polish ✅
- [x] UI/UX implementation with Swing
- [x] Basic error handling
- [x] Data persistence
- [x] Documentation (README, code comments)

## 🎓 Learning Objectives Achieved

Through this project, I have successfully:

### Data Structures & Algorithms
- ✅ Built a **custom Singly Linked List** from scratch without using Java Collections
- ✅ Implemented 12+ linked list operations (add, get, set, search, size, etc.)
- ✅ Used **inner Node class** to encapsulate data structure implementation
- ✅ Understood **pointer logic** and node-based traversal

### Software Architecture
- ✅ Applied **MVC (Model-View-Controller)** pattern in a real desktop application
- ✅ Achieved **separation of concerns** with distinct Model, View, and Controller layers
- ✅ Organized code into logical packages (`model`, `view`, `controller`)

### Object-Oriented Programming
- ✅ Implemented **encapsulation** with private fields and public getters/setters
- ✅ Used **static methods and constants** for utility functions
- ✅ Applied **abstraction** to hide implementation details
- ✅ Demonstrated **inner classes** for data structure organization

### Java Swing & GUI Development
- ✅ Built a comprehensive **desktop GUI** with 2200+ lines of Swing code
- ✅ Implemented **multiple panels and navigation** system with 3 sidebars
- ✅ Integrated **FlatLaf modern theme** for professional appearance
- ✅ Handled **button events and user interactions**

### File I/O & Data Persistence
- ✅ Implemented **BufferedReader and FileWriter** for file operations
- ✅ Designed **CSV-style data format** for order storage
- ✅ Built **read/write operations** that persist data across sessions
- ✅ Handled file creation and error scenarios

### Input Validation & Business Logic
- ✅ Created **phone number validation** (10 digits, starts with 0)
- ✅ Implemented **duplicate customer detection** algorithm
- ✅ Built **auto-incrementing order ID generator** (B0001, B0002, etc.)
- ✅ Managed **order status lifecycle** with constants and status names

### Software Engineering Practices
- ✅ Followed **clean code principles** with meaningful variable names
- ✅ Used **constants for magic numbers** (BURGER_PRICE, status codes)
- ✅ Implemented **single responsibility principle** for each class
- ✅ Added **git version control** with proper .gitignore configuration

## � Key Algorithms & Features

### 1. Order ID Generation
```java
// Auto-increments from B0001, B0002, B0003...
- Reads last order from BurgerOrders.txt
- Extracts numeric part and increments
- Formats with leading zeros: String.format("B%04d", number)
```

### 2. Phone Number Validation
```java
// Validates 10-digit Sri Lankan phone format
- Must be exactly 10 digits
- Must start with '0'
- All characters must be numeric (0-9)
```

### 3. Duplicate Customer Detection
```java
// Prevents duplicate phone numbers
- Searches through BurgerOrders.txt
- Returns true if phone exists
- Auto-fills customer name for existing customers
```

### 4. Linked List Traversal
```java
// Iterative node-by-node traversal
Node temp = first;
while (temp != null) {
    // Process temp.burgerOrder
    temp = temp.next;
}
```

### 5. Order Status Management
- **Status 0 (CANCEL)**: "Cancelled" - Order was cancelled
- **Status 1 (PREPARING)**: "Processing" - Order is being prepared
- **Status 2 (DELIVERED)**: "Delivered" - Order delivered successfully

### 6. File Persistence Strategy
- **CSV Format**: OrderID,CustomerPhone,CustomerName,Quantity,Status
- **Append Mode**: New orders added to end of file
- **Full Rewrite**: Updates require reading all orders into memory, modifying, and rewriting entire file
- **Load on Startup**: BurgerList populated from file when application launches

## �🔮 Future Enhancements

Potential improvements for future versions:
- 📊 Sales reports and analytics dashboard
- 💾 Database integration (MySQL/PostgreSQL)
- 🔄 Doubly Linked List implementation for bidirectional traversal
- 📚 Stack/Queue for order processing queue
- 🔍 Advanced search and filter algorithms
- 🔐 Multi-user authentication and roles
- 🖨️ Print receipt functionality
- 📦 Inventory management system
- 💰 Advanced billing and payment tracking
- 📱 Export data to CSV/Excel

## � Project Statistics

- **Total Java Files**: 4 (3 core classes + 1 GUI)
- **Lines of Code**: ~2,580 lines
  - Model: ~207 lines
  - Controller: ~174 lines
  - View: ~2,200 lines
- **Custom Methods**: 25+ methods across all classes
- **GUI Components**: 3 sidebars, 9 panels, multiple tables and buttons
- **External Libraries**: 2 (FlatLaf JARs)
- **Target JDK**: Java SE 11

## �👨‍💻 Author

**Pasindu OG**
- GitHub: [@PasinduOG](https://github.com/PasinduOG)
- Repository: [OOP-Node-iHungry-BurgerShop](https://github.com/PasinduOG/OOP-Node-iHungry-BurgerShop)
- Original Project: [OOP-Swing-iHungry-BurgerShop](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop)

## 📞 About

This project was developed as part of my coursework to demonstrate:
- Advanced Java programming skills
- Data Structures and Algorithms implementation
- Software Architecture and Design Patterns (MVC)
- Object-Oriented Programming principles
- Desktop application development with Java Swing

## 📂 Project Structure

```
OOP-Node-iHungry-BurgerShop/
├── src/
│   └── burgerShop/
│       ├── controller/
│       │   └── BurgerOrderController.java    # Business logic & file operations
│       ├── model/
│       │   ├── BurgerList.java               # Custom Linked List implementation
│       │   └── BurgerOrder.java              # Order entity class
│       └── view/
│           ├── MainPanel.java                # Swing GUI (2200+ lines)
│           └── MainPanel.form                # NetBeans form designer
├── lib/
│   ├── flatlaf-3.6.1.jar                     # FlatLaf look-and-feel
│   └── flatlaf-intellij-themes-3.6.1.jar     # IntelliJ themes
├── build/
│   └── classes/                              # Compiled .class files
├── nbproject/
│   ├── project.properties                    # NetBeans project config
│   ├── project.xml
│   └── private/
├── test/                                      # Test directory (empty)
├── BurgerOrders.txt                          # Generated data file (git-ignored)
├── .gitignore                                # Git ignore rules
├── build.xml                                 # Ant build script
├── manifest.mf                               # JAR manifest
└── README.md                                 # This file
```

### File Descriptions

#### Model Layer
- **`BurgerOrder.java`** (68 lines): Entity class representing a burger order with full encapsulation
- **`BurgerList.java`** (139 lines): Custom Linked List with Node inner class and 12+ methods

#### Controller Layer
- **`BurgerOrderController.java`** (174 lines): Contains all business logic including:
  - Order ID generation algorithm
  - Phone number validation (10 digits, starts with 0)
  - Duplicate customer detection
  - File read/write operations for persistence
  - Status management constants and methods

#### View Layer
- **`MainPanel.java`** (2200+ lines): Complete Swing GUI with:
  - 3 navigation sidebars (Main, Search, View Orders)
  - 9 different panels (Dashboard, Place Order, Update Order, etc.)
  - Multiple tables for displaying orders
  - Button handlers and event listeners
  - FlatLaf theme initialization
- **`MainPanel.form`**: NetBeans visual designer file (XML format)

#### Data File
- **`BurgerOrders.txt`**: CSV-style storage with format:
  ```
  OrderID,CustomerPhone,CustomerName,Quantity,Status
  B0001,0771234567,John Doe,5,1
  B0002,0712345678,Jane Smith,3,2
  ```

## 🙏 Acknowledgments

- Based on my previous [iHungry Burger Shop](https://github.com/PasinduOG/OOP-Swing-iHungry-BurgerShop) project
- Part of my OOP and Data Structures learning path
- Inspired by real-world software engineering practices

---

⭐ **Star this repository if you find it helpful!** ⭐

📌 **Status**: Core implementation complete  
📅 **Started**: October 2025  
📅 **Completed**: October 2025  
🎯 **Achievement**: Full implementation with custom Linked List and MVC architecture

---

## 🎯 Project Highlights

### What Makes This Project Special?

1. **🔧 Hand-Built Data Structure**: No ArrayList or LinkedList from Java Collections - built from scratch using Node and pointer logic
2. **🏗️ Clean Architecture**: True MVC pattern with clear separation between Model, View, and Controller
3. **💾 Persistent Storage**: All data saved and loaded automatically - no database needed
4. **🎨 Modern UI**: FlatLaf integration makes it look professional and contemporary
5. **✅ Input Validation**: Robust phone number validation and duplicate detection
6. **🔢 Smart ID Generation**: Auto-incrementing order IDs with proper formatting
7. **📊 Multiple Views**: Dashboard analytics, order management, search capabilities
8. **🎓 Educational Value**: Demonstrates core CS concepts - data structures, algorithms, design patterns

### Technical Achievements

- ✨ **Zero external data dependencies** - uses simple text file for persistence
- ✨ **Fully functional GUI** - complete desktop application ready to use
- ✨ **Production-ready code** - proper validation, error handling, and user feedback
- ✨ **Extensible design** - easy to add new features or modify existing ones
- ✨ **Clean code practices** - meaningful names, constants, and organized structure

---

## 📸 Screenshots

*Screenshots coming soon - showing the main interface and order management features*

---

## 🤝 Contributing

This is an educational project, but suggestions and improvements are welcome!
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/improvement`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/improvement`)
5. Open a Pull Request

---

## 📝 License

This project is open source and available for educational purposes.

---

⭐ **If you find this project helpful for learning Java, OOP, or Data Structures, please give it a star!** ⭐

*Feel free to fork, study, modify, and use this project for your own learning!*
