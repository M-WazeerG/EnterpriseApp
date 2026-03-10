
# Shark Diving Company – UML Domain Model

## Overview

This project models the **core operations of a shark diving company** using a UML domain model.  
The system is designed to manage **clients, bookings, transport services, boat trips, staff, and diving equipment**.

The goal of this model is to represent how the business operates and how the different entities interact with each other in order to support the booking and execution of shark diving trips.

----------
# UML Diagram

<img width="1380" height="1160" alt="Diagram 2026-03-10 09-13-27" src="https://github.com/user-attachments/assets/620fba84-dc01-4afb-adbf-15614b3b3459" />


----------


# System Entities

The system consists of the following **six core domain entities**:

-   Client
    
-   Booking
    
-   Transport
    
-   Boat
    
-   Staff
    
-   Equipment
    

Each entity represents an important part of the shark diving business process.

----------

# Business Rules

The system follows these core business rules:

1.  A **Client** can create one or more **Bookings**.
    
2.  Every **Booking** must belong to exactly **one Client**.
    
3.  A **Booking** may optionally request **Transport** if the client requires pickup.
    
4.  A **Booking** is assigned to a **Boat trip** where the shark diving activity occurs.
    
5.  A **Boat trip** can accommodate multiple **Bookings** depending on boat capacity.
    
6.  Each **Boat** requires multiple **Staff members** to safely operate the diving trip.
    
7.  **Staff members** may work on multiple boat trips.
    
8.  Each **Boat trip** carries the required **Equipment** needed for shark cage diving.
    
9.  Equipment such as wetsuits, oxygen tanks, masks, and cages must be available for diving operations.
    

----------

# Entity Descriptions

## 1. Client

### Purpose

Represents a customer who books a shark diving experience.

### Why it is needed

The system must store information about customers so bookings can be created and the company can contact them regarding their diving trip or pickup arrangements.

### Attributes


| Attribute    | Type   | Description                                           |
|--------------|--------|-------------------------------------------------------|
| clientNumber | String | Unique identifier for the client                     |
| firstName    | String | Client's first name                                   |
| lastName     | String | Client's last name                                    |
| phoneNumber  | String | Contact phone number                                  |
| email        | String | Client's email address                                |
| address      | String | Home address used for pickup if transport is required|

### Relationships

-   A **Client can make multiple Bookings**
    
-   Each **Booking belongs to exactly one Client**
    

### Multiplicity

```
Client (1) -------- (0..*) Booking

```

----------

# 2. Booking

### Purpose

Represents a reservation made by a client for a shark diving experience.

### Why it is needed

The booking acts as the **central record** connecting the client to a specific boat trip while storing important booking details.

### Attributes


| Attribute       | Type  | Description                                |
|----------------|-----------|----------------------------------------|
| bookingNumber  | String    | Unique booking identifier               |
| bookingDate    | LocalDate | Date the booking was made               |
| participants   | int       | Number of people included in the booking|
| pickupRequired | boolean   | Indicates if the client requires transport|

### Relationships

-   Each **Booking belongs to one Client**
    
-   A **Booking may require Transport**
    
-   A **Booking is assigned to a Boat trip**
    

### Multiplicity

```
Booking (0..*) -------- (1) Boat
Booking (0..1) -------- (1) Transport

```

----------

# 3. Transport

### Purpose

Represents the optional pickup service provided by the company.

### Why it is needed

Some clients prefer to be picked up from their homes rather than traveling to the diving location themselves.

### Attributes


| Attribute       | Type  | Description                                |
|----------------|-----------|----------------------------------------|
| transportNumber | String   | Unique transport identifier             |
| pickupLocation  | String   | Location where the client will be picked up |
| vehicleType     | String   | Type of vehicle used for transport     |
| driverName      | String   | Name of the assigned driver            |

### Relationships

-   A **Booking may have Transport if pickup is required**
    

### Multiplicity

```
Booking (0..1) -------- (1) Transport

```

----------

# 4. Boat

### Purpose

Represents the boat used to conduct shark diving trips.

### Why it is needed

The boat is the primary resource used to transport divers to the ocean where shark cage diving takes place.

### Attributes


| Attribute   | Type  | Description                               |
|------------|-----------|---------------------------------------|
| boatNumber | String    | Unique boat identifier                 |
| boatName   | String    | Name of the boat                       |
| capacity   | int       | Maximum number of passengers the boat can carry |
| tripDate   | LocalDate | Date of the diving trip                |

### Relationships

-   A **Boat trip can have many Bookings**
    
-   A **Boat requires Staff to operate**
    
-   A **Boat carries Equipment needed for diving**
    

### Multiplicity

```
Boat (1) -------- (0..*) Booking
Boat (1) -------- (0..*) Staff
Boat (1) -------- (0..*) Equipment

```

----------

# 5. Staff

### Purpose

Represents employees who work on shark diving trips.

### Why it is needed

Trips require trained professionals such as **boat crew, diving instructors, safety divers, and guides**.

### Attributes


| Attribute     | Type | Description                                         |
|--------------|----------|-------------------------------------------------|
| staffNumber  | String   | Unique staff identifier                         |
| firstName    | String   | Staff member's first name                       |
| lastName     | String   | Staff member's last name                        |
| phoneNumber  | String   | Staff contact number                            |
| staffEmail   | String   | Staff email address                             |
| role         | String   | Job role (e.g., Captain, Dive Instructor, Crew)|

### Relationships

-   Staff members work on boat trips.
    

### Multiplicity

```
Staff (0..*) -------- (0..*) Boat

```

Meaning:

-   A **boat trip requires multiple staff members**
    
-   A **staff member can work on multiple boat trips**
    

----------

# 6. Equipment

### Purpose

Represents diving gear provided by the company.

### Why it is needed

The company provides all necessary diving equipment to ensure safety during the shark diving experience.

Examples include:

-   wetsuits
    
-   oxygen tanks
    
-   diving masks
    
-   shark cages
    

### Attributes


| Attribute       | Type | Description                                  |
|----------------|----------|------------------------------------------|
| equipmentNumber| String   | Unique equipment identifier              |
| equipmentName  | String   | Name of the equipment                    |
| onHand         | int      | Number of units available                |
| condition      | String   | Current condition of the equipment      |

### Relationships

-   Equipment is used on boat trips.
    

### Multiplicity

```
Boat (1) -------- (0..*) Equipment

```

----------

# System Flow

The overall system process works as follows:

```
Client → creates → Booking
Booking → may request → Transport
Booking → assigned to → Boat Trip
Boat Trip → operated by → Staff
Boat Trip → uses → Equipment

```

This flow represents the **core operational process** of the shark diving company from booking to the actual diving experience.

----------


# Technologies Used (Planned)

This project will be implemented in **Java** and will include:

- Domain classes representing the main entities (Client, Booking, Transport, Boat, Staff, Equipment)
- Factory and repository classes for object creation and data management
- Implementation of the **Builder pattern** for flexible object construction
- Singleton pattern for classes requiring a single instance
- A generic helper class to support reusable functionality
- Test packages to implement unit tests and ensure code quality
    

----------



